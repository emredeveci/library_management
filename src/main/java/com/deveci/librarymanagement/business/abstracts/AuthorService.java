package com.deveci.librarymanagement.business.abstracts;


import com.deveci.librarymanagement.entities.Author;
import org.springframework.data.domain.Page;

public interface AuthorService {
    Author save(Author author);

    Author get(long id);
    Page<Author> cursor(int page, int pageSize);
    Author update(Author author);
    boolean delete(long id);
}
