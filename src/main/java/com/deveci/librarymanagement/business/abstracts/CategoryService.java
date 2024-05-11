package com.deveci.librarymanagement.business.abstracts;

import com.deveci.librarymanagement.entities.Author;
import com.deveci.librarymanagement.entities.Category;
import org.springframework.data.domain.Page;

public interface CategoryService {
    Category save(Category category);
    Category get(long id);
    Page<Category> cursor(int page, int pageSize);
    Category update(Category category);
    boolean delete(long id);
}
