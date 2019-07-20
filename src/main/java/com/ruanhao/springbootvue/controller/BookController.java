package com.ruanhao.springbootvue.controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ruanhao.springbootvue.model.BookModel;
import com.ruanhao.springbootvue.service.BookService;

import javax.servlet.http.HttpServletRequest;

@RestController
public class BookController {

    @Autowired
    BookService bookService;

    @GetMapping("/addBook")
    public String addBook() {
        System.out.println("111111111111111");
        BookModel model = new BookModel();
        model.setName("西厢记");
        model.setAuthor("王实甫");
        Integer id =  bookService.addBook(model);
        return id+"";
    }
    @GetMapping("/getBookById")
    public String addBook(HttpServletRequest request) {
        Integer id = Integer.valueOf(request.getParameter("id"));
        BookModel bookModel =  bookService.getBookById(id);
        return bookModel.getAuthor();
    }
}
