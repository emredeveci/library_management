package com.deveci.librarymanagement.business.concretes;

import com.deveci.librarymanagement.business.abstracts.CategoryService;
import com.deveci.librarymanagement.dao.CategoryRepo;
import com.deveci.librarymanagement.entities.Category;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Service;

@Service
public class CategoryManager implements CategoryService {

    private final CategoryRepo categoryRepo;

    public CategoryManager(CategoryRepo categoryRepo) {
        this.categoryRepo = categoryRepo;
    }

    @Override
    public Category save(Category category) {
        return null;
    }

    @Override
    public Category get(long id) {
        return null;
    }

    @Override
    public Page<Category> cursor(int page, int pageSize) {
        return null;
    }

    @Override
    public Category update(Category category) {
        return null;
    }

    @Override
    public boolean delete(long id) {
        return false;
    }
}
