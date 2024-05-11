package com.deveci.librarymanagement.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Entity
@Table(name = "publishers")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Publisher {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "publisher_id",columnDefinition = "serial")
    private Long id;

    @Column(name = "name",nullable = false)
    private String name;

    @Temporal(TemporalType.DATE)
    @Column(name = "establishment_year",nullable = false)
    private int establishmentYear;

    @Column(name = "address",nullable = false)
    private String address;

    @OneToMany(mappedBy = "publisher", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Book> books;
}
