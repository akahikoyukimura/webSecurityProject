package com.webSecurity.webSecurityProject.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.webSecurity.webSecurityProject.model.Command;
import com.webSecurity.webSecurityProject.model.User;

public interface UserRepository extends JpaRepository<User,Long>{

}
