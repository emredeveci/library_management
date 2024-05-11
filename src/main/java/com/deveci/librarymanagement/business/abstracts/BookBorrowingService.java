package com.deveci.librarymanagement.business.abstracts;

import com.deveci.librarymanagement.entities.Book;
import com.deveci.librarymanagement.entities.BookBorrowing;
import org.springframework.data.domain.Page;

public interface BookBorrowingService {

    BookBorrowing save(BookBorrowing bookBorrowing);
    BookBorrowing get(Long id);
    Page<BookBorrowing> cursor(int page, int pageSize);
    BookBorrowing update(BookBorrowing bookBorrowing);
    boolean delete(Long id);
}
