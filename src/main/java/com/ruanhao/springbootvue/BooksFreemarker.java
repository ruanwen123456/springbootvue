package com.ruanhao.springbootvue;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

public class BooksFreemarker {
	@GetMapping("/booksftl")
	public ModelAndView books(){
		List<Book> books = new ArrayList<Book>();
		Book book1 = new Book();
		book1.setId(1);
		book1.setAuthor("罗贯中");
		book1.setName("三国演义");
		
		Book book2 = new Book();
		book2.setId(2);
		book2.setAuthor("曹雪芹");
		book2.setName("红楼梦");
		
		books.add(book1);
		books.add(book2);
		ModelAndView mv = new ModelAndView();
		mv.addObject("books", books);
		mv.setViewName("booksftl");
		
		return mv;
	}
}
