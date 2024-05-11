package com.deveci.librarymanagement.dto.response.publisher;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class PublisherResponse {
    private String name;
    private int establishmentYear;
}
