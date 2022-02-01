package br.com.recode.eurotripcrudmvc.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.recode.eurotripcrudmvc.model.Cliente;

public interface ClienteRepository extends JpaRepository<Cliente, Long> {
    
}
