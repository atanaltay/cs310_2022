package com.sabanciuniv.controller;

import java.time.LocalDateTime;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.fasterxml.jackson.databind.introspect.DefaultAccessorNamingStrategy.FirstCharBasedValidator;

@RestController
@RequestMapping("/helloapi")
public class SpringRestHelloAPI {
	
	//@GetMapping, @PostMapping, ...
	
	@GetMapping("/hello")
	public String hello() {
		return "Hello web!!";
	}
	
	@GetMapping("/helloname/{name}/{lastname}")
	public String helloToName(@PathVariable String name, 
			@PathVariable String lastname) {
		
		
		return "Hello web!! -- " + name + " " + lastname ;
		
		
	}
	
	@GetMapping("/hellojson/{name}/{lastname}")
	public Message helloToMessage(@PathVariable String name, 
			@PathVariable String lastname) {
		
		Message msg = new Message("Hello " + lastname + " " + name, 
				LocalDateTime.now());
		
		return msg;
		
	}
	
	@PostMapping("/hellojsoninput")
	public User helloUser(@RequestBody User user) {
		
		//save the user info to db
		return user;
		
	}
	
	
	class Message{
		
		private String text;
		private LocalDateTime time;
		
		public Message() {
			// TODO Auto-generated constructor stub
		}
		
		public Message(String text, LocalDateTime time) {
			super();
			this.text = text;
			this.time = time;
		}

		public String getText() {
			return text;
		}

		public void setText(String text) {
			this.text = text;
		}

		public LocalDateTime getTime() {
			return time;
		}

		public void setTime(LocalDateTime time) {
			this.time = time;
		}
		
		
		
	}

}
