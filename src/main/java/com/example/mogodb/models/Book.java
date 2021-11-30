package com.example.mogodb.models;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Data;

@Data
@Document(collection="Book")
public class Book {

	@Id
    private String id;
	private String bookName;
	private String authorName;
	
}
