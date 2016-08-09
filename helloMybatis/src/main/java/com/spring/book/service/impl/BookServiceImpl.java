package com.spring.book.service.impl;

import java.util.List;

import javax.annotation.Resource;
 
import org.springframework.stereotype.Service;

import com.spring.book.dao.BookDao;
import com.spring.book.model.Book;
import com.spring.book.service.BookService;
 
@Service("bookService")
public class BookServiceImpl implements BookService {
     
    @Resource(name="bookDao")
    private BookDao bookDao;
 
    @Override
    public List<Book> getBookList() {
        return bookDao.getBookList();
    }
 
}