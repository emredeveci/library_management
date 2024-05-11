package com.deveci.librarymanagement.entities;

import jakarta.persistence.*;
import jakarta.validation.constraints.Email;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "borrowings")
public class BookBorrowing {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "borrowing_id", columnDefinition = "serial")
    private Long id;

    @Column(name = "borrower_name", nullable = false)
    private String borrowerName;

    @Temporal(TemporalType.DATE)
    @Column(name = "borrowing_start_date", nullable = false)
    private LocalDate borrowingDate;

    @Temporal(TemporalType.DATE)
    @Column(name = "borrowing_end_date", nullable = false)
    private LocalDate returnDate;

    @Column(name = "borrower_email")
    @Email
    private String mail;

    @ManyToOne(fetch = FetchType.LAZY, cascade = CascadeType.MERGE)
    @JoinColumn(name = "book_id", referencedColumnName = "book_id", nullable = false)
    private Book book;
}
