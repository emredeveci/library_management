package com.deveci.librarymanagement.dto.request.author;

import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Positive;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class AuthorUpdateRequest {

    @Positive(message = "id must be a positive value")
    private long id;

    @NotNull(message = "name cannot be empty")
    private String name;

    @Positive(message = "birthday cannot be empty and must be a positive value")
    private int birthday;

    @NotNull(message = "country cannot be empty")
    private String country;
}
