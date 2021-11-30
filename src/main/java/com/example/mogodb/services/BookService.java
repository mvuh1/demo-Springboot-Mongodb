package com.example.mogodb.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.mogodb.models.Book;
import com.example.mogodb.repositories.BookRepository;

@Service
public class BookService {

	@Autowired
	private BookRepository bookR;
	
	// add new Book
	public String saveBook(Book b)  {
		bookR.save(b);
		return "added Book with Id : " + b.getId();
	}

	// get all Books
	public List<Book> getBooks() {
		return bookR.findAll();
	}

	// get Book by id
	public Optional<Book> getBook(String id) {
		return bookR.findById(id);
	}

	// delete Book
	public String deleteBook(String id) {
		bookR.deleteById(id);
		return "book delete with id : " + id;
	}
}
