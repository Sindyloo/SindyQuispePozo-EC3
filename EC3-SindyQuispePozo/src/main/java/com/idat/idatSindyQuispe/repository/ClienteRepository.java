
package com.idat.idatSindyQuispe.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.idat.idatSindyQuispe.model.Cliente;



@Repository
public interface ClienteRepository extends JpaRepository<Cliente, Integer> {

}
