package com.ruanhao.springbootvue.dao;

import org.apache.ibatis.annotations.Mapper;

import com.ruanhao.springbootvue.model.BookModel;

@Mapper
public interface BookDao {

    int addBook(BookModel book);

    int deleteBookById(Integer id);

    int updataBookById(BookModel book);

    BookModel getBookById(Integer id);
}
