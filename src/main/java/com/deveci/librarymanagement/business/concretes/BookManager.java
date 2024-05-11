package com.deveci.librarymanagement.business.concretes;

import com.deveci.librarymanagement.business.abstracts.BookService;
import com.deveci.librarymanagement.dao.BookRepo;
import com.deveci.librarymanagement.entities.Book;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Service;

@Service
public class BookManager implements BookService {

    private final BookRepo bookRepo;

    public BookManager(BookRepo bookRepo) {
        this.bookRepo = bookRepo;
    }

    @Override
    public Book save(Book book) {
        return this.bookRepo.save(book);
    }

    @Override
    public Book get(Long id) {
        return null;
    }

    @Override
    public Page<Book> cursor(int page, int pageSize) {
        return null;
    }

    @Override
    public Book update(Book book) {
        return null;
    }

    @Override
    public boolean delete(Long id) {
        return false;
    }
}
