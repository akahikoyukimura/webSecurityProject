package com.webSecurity.webSecurityProject.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.webSecurity.webSecurityProject.model.Command;

public interface CommandRepository extends JpaRepository<Command,Long>{

}
