package com.deveci.librarymanagement.core.config.modelMapper;

import org.modelmapper.ModelMapper;

public interface ModelMapperService {
    ModelMapper forRequest();
    ModelMapper forResponse();
}
