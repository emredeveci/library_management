package com.deveci.librarymanagement.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.time.LocalDate;
import java.util.List;

@Entity
@Table(name = "authors")
@ToString
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Author {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "author_id",columnDefinition = "serial")
    private long id;

    @Column(name = "name",nullable = false)
    private String name;

    @Column(name = "birthday",nullable = false)
    private int birthday;

    @Column(name = "country",nullable = false)
    private String country;

    @OneToMany(mappedBy = "author", cascade = CascadeType.REMOVE)
    private List<Book> bookList;
}
