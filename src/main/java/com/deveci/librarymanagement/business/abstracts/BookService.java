package com.deveci.librarymanagement.business.abstracts;

import com.deveci.librarymanagement.entities.Book;
import org.springframework.data.domain.Page;

public interface BookService {

    Book save(Book book);
    Book get(Long id);
    Page<Book> cursor(int page, int pageSize);
    Book update(Book book);
    boolean delete(Long id);

}
