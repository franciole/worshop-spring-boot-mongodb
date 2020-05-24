package com.curso.workshopmongo.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.curso.workshopmongo.domain.Post;

public interface PostRepository extends MongoRepository<Post, String>{

}
