package com.crudservice.crud;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.crudservice.crud.repository.UsersRepository;
import com.crudservice.crud.db.Users;

@SpringBootApplication
@RestController
@RequestMapping(value="", produces = "application/json")
public class CrudApplication {

	@Autowired
	private UsersRepository userRepository;
	
	public static void main(String[] args) {
		SpringApplication.run(CrudApplication.class, args);
	}
	
	@RequestMapping("create-table-user")
	public Users createUser() {
		return userRepository.save(new Users());
		
	}

}