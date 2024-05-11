package com.deveci.librarymanagement.business.abstracts;

import com.deveci.librarymanagement.entities.Publisher;
import org.springframework.data.domain.Page;

public interface PublisherService {
    Publisher save(Publisher publisher);
    Publisher update(Publisher publisher);
    Publisher get(long id);
    Page<Publisher> cursor(int page, int pageSize);
    boolean delete(long id);
}
