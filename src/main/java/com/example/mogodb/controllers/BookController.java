package com.example.mogodb.controllers;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.mogodb.models.Book;
import com.example.mogodb.services.BookService;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

@Api("Gestion des comptes clients mobile")
@RestController
@RequestMapping("/api")
@CrossOrigin("*")
public class BookController {
	
	@Autowired
	private BookService bookS;
	
	@ApiOperation("add new book on app")
	@PostMapping("/addBook")
	public String saveBook(@RequestBody Book b)  {
		return bookS.saveBook(b);
	}
	
	@ApiOperation("get all books from app")
	@GetMapping("/findAllBooks")
	public List<Book> getBooks() {
		return bookS.getBooks();
	}
	
	@ApiOperation("find book by his Id")
	@GetMapping("/findAllBooks/{id}")
	public Optional<Book> getBook(@PathVariable String id) {
		return bookS.getBook(id);
	}
	
	@ApiOperation("delete book by passing his Id")
	@DeleteMapping("/deleteBook/{id}")
	public String deleteBook(@PathVariable String id) {
		return bookS.deleteBook(id);
	}

}
