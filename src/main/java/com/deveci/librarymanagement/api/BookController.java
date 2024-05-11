package com.deveci.librarymanagement.api;

import com.deveci.librarymanagement.business.abstracts.AuthorService;
import com.deveci.librarymanagement.business.abstracts.BookService;
import com.deveci.librarymanagement.core.config.modelMapper.ModelMapperService;
import com.deveci.librarymanagement.core.result.Result;
import com.deveci.librarymanagement.core.result.ResultData;
import com.deveci.librarymanagement.core.utils.ResultHelper;
import com.deveci.librarymanagement.dto.request.book.BookSaveRequest;
import com.deveci.librarymanagement.dto.request.book.BookUpdateRequest;
import com.deveci.librarymanagement.dto.response.book.BookResponse;
import com.deveci.librarymanagement.dto.response.supplier.CursorResponse;
import com.deveci.librarymanagement.entities.Author;
import com.deveci.librarymanagement.entities.Book;
import jakarta.validation.Valid;
import org.springframework.data.domain.Page;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/v1/books")
public class BookController {

    private final BookService bookService;
    private final ModelMapperService modelMapper;
    private final AuthorService authorService;

    public BookController(BookService bookService, ModelMapperService modelMapper, AuthorService authorService) {
        this.bookService = bookService;
        this.modelMapper = modelMapper;
        this.authorService = authorService;
    }

    @GetMapping("{id}")
    public ResultData<BookResponse> getId(@PathVariable("id") long id){
        BookResponse bookResponse = modelMapper.forResponse().map(bookService.get(id), BookResponse.class);
        return ResultHelper.success(bookResponse);
    }
    @PostMapping

    public ResultData<BookResponse> save(@Valid @RequestBody BookSaveRequest bookSaveRequest){
        BookResponse bookResponse = modelMapper.forResponse().map(bookService.save(modelMapper.forRequest().map(bookSaveRequest, Book.class)),BookResponse.class);
        Author author = this.authorService.get(bookSaveRequest.get);
        return ResultHelper.created(bookResponse);
    }
    @PutMapping
    public ResultData<BookResponse> update(@Valid @RequestBody BookUpdateRequest bookUpdateRequest){
        BookResponse bookResponse = modelMapper.forResponse().map(bookService.update(modelMapper.forRequest().map(bookUpdateRequest, Book.class)),BookResponse.class);
        return ResultHelper.success(bookResponse);
    }
    @DeleteMapping("{id}")
    public Result delete(@PathVariable("id") long id){
        return ResultHelper.success(bookService.delete(id));
    }

    @GetMapping
    public ResultData<CursorResponse<BookResponse>> cursor(@RequestParam(name = "page", required = false, defaultValue = "0") int page, @RequestParam(name = "pageSize", required = false, defaultValue = "10") int pageSize) {
        Page<Book> books = bookService.cursor(page,pageSize);
        Page<BookResponse> bookResponses = books.map(category -> modelMapper.forResponse().map(category,BookResponse.class));
        return ResultHelper.cursor(bookResponses);
    }
}
