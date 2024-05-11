package com.deveci.librarymanagement.dao;

import com.deveci.librarymanagement.entities.Book;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BookRepo extends JpaRepository<Book, Long> {
}
