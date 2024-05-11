package com.deveci.librarymanagement.dto.request.author;

import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@AllArgsConstructor
@NoArgsConstructor
public class AuthorSaveRequest {
    @NotNull(message = "Category name cannot be empty or null.")
    @NotEmpty
    private String name;

    @NotNull(message = "Birthday cannot be empty or null.")
    private int birthday;

    @NotNull(message = "Country cannot be empty or null.")
    @NotEmpty
    private String country;
}
