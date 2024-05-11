package com.deveci.librarymanagement.dto.request.category;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class CategorySaveRequest {
    private String name;
    private String description;
}
