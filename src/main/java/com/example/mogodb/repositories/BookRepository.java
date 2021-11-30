package com.example.mogodb.repositories;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.example.mogodb.models.Book;

public interface BookRepository extends MongoRepository<Book, String>{

}
