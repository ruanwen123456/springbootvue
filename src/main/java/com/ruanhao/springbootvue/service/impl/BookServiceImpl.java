package com.ruanhao.springbootvue.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ruanhao.springbootvue.dao.BookDao;
import com.ruanhao.springbootvue.model.BookModel;
import com.ruanhao.springbootvue.service.BookService;

@Service
public class BookServiceImpl implements BookService{


    @Autowired(required = false)
    BookDao bookDao;

    public int addBook(BookModel book) {
        return bookDao.addBook(book);
    }

    public int deleteById(Integer id) {
        return bookDao.deleteBookById(id);
    }

    public int updateBook(BookModel book) {
        return bookDao.updataBookById(book);
    }

    public BookModel getBookById(Integer id) {
        return bookDao.getBookById(id);
    }
}
