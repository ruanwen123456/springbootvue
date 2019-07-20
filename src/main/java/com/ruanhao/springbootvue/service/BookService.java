package com.ruanhao.springbootvue.service;

import com.ruanhao.springbootvue.model.BookModel;

public interface BookService {

    //增加
    int addBook(BookModel book);

    //根据id删除数据
    int deleteById(Integer id);

    //修改
    int updateBook(BookModel book);

    //根据id查找数据
    BookModel getBookById(Integer id);
}
