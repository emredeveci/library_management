package com.deveci.librarymanagement.dto.response.book;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class BookResponse {
    private Long id;
    private String name;
    private String author;
    private int stock;
}
