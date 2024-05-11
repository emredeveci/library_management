package com.deveci.librarymanagement.dto.request.book;


import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class BookSaveRequest {
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
    private Long authorId;
}
