package com.cyp.service;

import com.cyp.dao.BookMapper;
import com.cyp.pojo.Books;
import com.cyp.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class BookServiceImpl implements BookService {

    public void setBookMapper(BookMapper bookMapper) {
        this.bookMapper = bookMapper;
    }

//    @Autowired
    private BookMapper bookMapper;


    public int addBook(Books book) {
        return bookMapper.addBook(book);
    }

    public int deleteBookById(int id) {
        return bookMapper.deleteBookById(id);
    }

    public int updateBook(Books books) {
        return bookMapper.updateBook(books);
    }

    public Books queryBookById(int id) {
        return bookMapper.queryBookById(id);
    }

    public List<Books> queryAllBook() {
        return bookMapper.queryAllBook();
    }

    public Books queryBookByName(String bookName) {
        return bookMapper.queryBookByName(bookName);
    }


}
