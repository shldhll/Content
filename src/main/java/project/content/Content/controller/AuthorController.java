package project.content.Content.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;
import project.content.Content.model.Author;
import project.content.Content.service.AuthorService;

import javax.validation.Valid;
import java.util.List;

@Validated
@RestController
@RequestMapping("/author")
public class AuthorController {
    @Autowired
    private AuthorService service;

    @PostMapping
    public Author addAuthor(@RequestBody @Valid Author author) {
        return service.addAuthor(author);
    }

    @GetMapping
    public List<Author> getAuthors() {
        return service.getAuthors();
    }

    @GetMapping("/{id}")
    public Author getAuthorById(@PathVariable Integer id) {
        return service.getAuthorById(id);
    }

    @PutMapping
    public Author updateAuthor(@RequestBody @Valid Author author) {
        return service.updateAuthor(author);
    }

    @DeleteMapping("/{id}")
    public void deleteAuthor(@PathVariable Integer id) {
        service.deleteAuthor(id);
    }
}
