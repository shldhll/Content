package project.content.Content.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import project.content.Content.model.Author;
import project.content.Content.repository.AuthorRepository;

import java.util.List;

@Service
public class AuthorService {
    @Autowired
    private AuthorRepository repository;

    public Author addAuthor(Author author) {
        return repository.save(author);
    }

    public Author getAuthorById(Integer id) {
        return repository.findById(id).orElse(null);
    }

    public List<Author> getAuthors() {
        return repository.findAll();
    }

    public Author updateAuthor(Author author) {
        Author existingAuthor = getAuthorById(author.getId());
        existingAuthor.setName(author.getName());
        existingAuthor.setProfileUrl(author.getProfileUrl());
        return repository.save(existingAuthor);
    }

    public void deleteAuthor(Integer id) {
        repository.deleteById(id);
    }
}
