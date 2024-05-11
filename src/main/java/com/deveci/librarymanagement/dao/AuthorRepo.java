package com.deveci.librarymanagement.dao;

import com.deveci.librarymanagement.entities.Author;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AuthorRepo extends JpaRepository<Author, Long> {
}
