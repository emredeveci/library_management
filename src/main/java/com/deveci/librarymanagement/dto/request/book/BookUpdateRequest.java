package com.deveci.librarymanagement.dto.request.book;

import com.deveci.librarymanagement.entities.Author;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class BookUpdateRequest {

    @NotEmpty
    private Long id;

    @NotNull
    @NotEmpty
    private String name;

    @NotNull
    @NotEmpty
    private int publicationYear;

    @NotNull
    @NotEmpty
    private int stock;

    @NotNull
    @NotEmpty
    private Author author;
}
