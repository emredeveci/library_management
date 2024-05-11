package com.deveci.librarymanagement.dao;

import com.deveci.librarymanagement.entities.Publisher;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PublisherRepo extends JpaRepository<Publisher, Long> {
}
