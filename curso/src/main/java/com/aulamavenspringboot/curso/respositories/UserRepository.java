package com.aulamavenspringboot.curso.respositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.aulamavenspringboot.curso.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {

	
	
}
