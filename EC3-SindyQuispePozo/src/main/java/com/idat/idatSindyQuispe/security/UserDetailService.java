package com.idat.idatSindyQuispe.security;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;


import com.idat.idatSindyQuispe.model.UsuarioCliente;
import com.idat.idatSindyQuispe.repository.UsuarioClienteRepository;

@Service
public class UserDetailService implements UserDetailsService{
	
	@Autowired
	private UsuarioClienteRepository repository;

	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		UsuarioCliente usuario = repository.findByUsuarioCliente(username); 
		
		if(usuario != null) {
			List<GrantedAuthority> granted = new ArrayList<GrantedAuthority>();
			GrantedAuthority authority = new SimpleGrantedAuthority(usuario.getRol());
			granted.add(authority);
			return new User(usuario.getUsuario(),new BCryptPasswordEncoder().encode(usuario.getPassword()),granted);
		}else {
			throw new UsernameNotFoundException("E l usuario no existe");
		}
	}
}
