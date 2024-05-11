package com.deveci.librarymanagement.business.concretes;

import com.deveci.librarymanagement.business.abstracts.BookBorrowingService;
import com.deveci.librarymanagement.entities.BookBorrowing;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Service;

@Service
public class BookBorrowingManager implements BookBorrowingService {
    @Override
    public BookBorrowing save(BookBorrowing bookBorrowing) {
        return null;
    }

    @Override
    public BookBorrowing get(Long id) {
        return null;
    }

    @Override
    public Page<BookBorrowing> cursor(int page, int pageSize) {
        return null;
    }

    @Override
    public BookBorrowing update(BookBorrowing bookBorrowing) {
        return null;
    }

    @Override
    public boolean delete(Long id) {
        return false;
    }
}
