package com.ruanhao.springbootvue;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BookController {
	
	@Autowired
	private Book book;
	@GetMapping("/book")
	public String book() {
		System.out.println(book.getName());
		return book.getName();
	}
}
