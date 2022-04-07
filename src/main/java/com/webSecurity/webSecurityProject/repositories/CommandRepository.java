package com.webSecurity.webSecurityProject.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.webSecurity.webSecurityProject.model.Command;
import com.webSecurity.webSecurityProject.model.User;

public interface CommandRepository extends JpaRepository<Command,Long>{

	List<Command> findAllByClient(User client);
}
