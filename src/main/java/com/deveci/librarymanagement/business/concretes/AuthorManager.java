package com.deveci.librarymanagement.business.concretes;

import com.deveci.librarymanagement.business.abstracts.AuthorService;
import com.deveci.librarymanagement.core.exception.NotFoundException;
import com.deveci.librarymanagement.core.utils.Msg;
import com.deveci.librarymanagement.dao.AuthorRepo;
import com.deveci.librarymanagement.entities.Author;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

@Service
public class AuthorManager implements AuthorService {

    private final AuthorRepo authorRepo;

    public AuthorManager(AuthorRepo authorRepo) {
        this.authorRepo = authorRepo;
    }

    @Override
    public Author save(Author author) {
        return this.authorRepo.save(author);
    }

    @Override
    public Author get(long id) {
        return this.authorRepo.findById(id).orElseThrow(()-> new NotFoundException(Msg.NOT_FOUND));
    }

    @Override
    public Page<Author> cursor(int page, int pageSize) {
        Pageable pageable = PageRequest.of(page, pageSize);
        return this.authorRepo.findAll(pageable);
    }


    @Override
    public Author update(Author author) {
        this.get(author.getId());
        return this.authorRepo.save(author);
    }

    @Override
    public boolean delete(long id) {
        Author author = this.get(id);
        this.authorRepo.delete(author);
        return true;
    }
}
