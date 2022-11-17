package com.sabanciuniv.controller;
import java.util.List;

import javax.annotation.PostConstruct;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sabanciuniv.model.Author;
import com.sabanciuniv.model.Book;
import com.sabanciuniv.model.BookPayload;
import com.sabanciuniv.model.Publisher;
import com.sabanciuniv.repo.AuthorRepository;
import com.sabanciuniv.repo.BookRepository;
import com.sabanciuniv.repo.PublisherRepo;

@RestController
@RequestMapping("/bookstore")
public class BookStoreRestController {
	
	
	@Autowired private AuthorRepository authorRepository;
	@Autowired private BookRepository bookRepository;
	@Autowired private PublisherRepo publisherRepository;
	
	private static final Logger logger = LoggerFactory.getLogger(BookStoreRestController.class);
	
	@PostConstruct
	public void init() {
		
		if(publisherRepository.count() ==0) {
			logger.info("Database is empty, initializing..");
			Publisher pub1 = new Publisher("Oxford", "Oxford City");
			Publisher pub2 = new Publisher("Cambridge", "Cambridge City");
			Publisher pub3 = new Publisher("Penguin", "London");
			
			publisherRepository.save(pub1);
			publisherRepository.save(pub2);
			publisherRepository.save(pub3);
			
			Author a1 = new Author("author1","one");
			Author a2 = new Author("author2","two");
			Author a3 = new Author("author3","three");
			
			authorRepository.save(a1);
			authorRepository.save(a2);
			authorRepository.save(a3);
			
			
			
			List<Author> authors = authorRepository.findAll();
			List<Publisher> pubs = publisherRepository.findAll();
			
			
			Book b1 = new Book("Book 1", 2022,"Book 1 content" , authors.get(0), pubs.get(0));
			Book b2 = new Book("Book 2", 1999,"Book 2 content" , authors.get(1), pubs.get(1));
			Book b3 = new Book("Book 3", 2000,"Book 3 content" , authors.get(2), pubs.get(2));
			Book b4 = new Book("Book 4", 2020,"Book 4 content" , authors.get(0), pubs.get(0));
			Book b5 = new Book("Book 5", 2022,"Book 5 content" , authors.get(1), pubs.get(2));
			
			bookRepository.save(b1);
			bookRepository.save(b2);
			bookRepository.save(b3);
			bookRepository.save(b4);
			bookRepository.save(b5);
			
			logger.info("All sample data saved!");
			
			

		}
		
		
		
	}
	
	
	@GetMapping("/authors")
	public List<Author> authors(){
		
		return authorRepository.findAll();
	
	}
	
	@PostMapping("/authors/save")
	public Author saveAuthor(@RequestBody Author author) {
		
		Author authorSaved = authorRepository.save(author);
		return authorSaved;
	}
	
	
	
	@GetMapping("/books")
	public List<Book> books(){
		return bookRepository.findAll();
	}
	
	@PostMapping("/books/search")
	public List<Book> searchBooks(@RequestBody BookPayload payload){
		
		List<Book> books=
				bookRepository.findByTitleContainsIgnoreCase(payload.getTitle());
		
		return books;
	}
	
	@PostMapping("/books/save")
	public Book saveBook(@RequestBody BookPayload payload)
	{
		//Author auth = authorRepository.findById(payload.getAuthorid()).get();
		
		Author auth = new Author();
		auth.setId(payload.getAuthorid());
		
		Publisher pub = new Publisher();
		pub.setId(payload.getPublisherid());
		
		
		Book bookToSave = new Book(payload.getTitle(), 
				payload.getYear(), payload.getContent(), 
				auth, pub);
		
		Book bookSaved= bookRepository.save(bookToSave);
		
		return bookSaved;
		
	}
	
	
	
	
	@GetMapping("/publishers")
	public List<Publisher> publishers(){
		return publisherRepository.findAll();
	}
	
	@PostMapping("/publishers/save")
	public Publisher savePublisher(@RequestBody Publisher publisher) {
		
		Publisher pubSaved = publisherRepository.save(publisher);
		return pubSaved;
	}
	

}
