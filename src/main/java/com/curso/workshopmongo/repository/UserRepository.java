package com.curso.workshopmongo.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.curso.workshopmongo.domain.User;

public interface UserRepository extends MongoRepository<User, String>{

}
