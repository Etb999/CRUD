package com.crudservice.crud.repository;

import org.springframework.data.repository.CrudRepository;

import com.crudservice.crud.db.Users;


public interface UsersRepository extends CrudRepository<Users, Long>{

}
