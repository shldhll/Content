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

    public void addAuthor(Author author) {
        repository.save(author);
    }

    public Author getAuthorById(Integer id) {
        return repository.findById(id).orElse(null);
    }

    public List<Author> getAuthors() {
        return repository.findAll();
    }

    public void updateAuthor(Author author) {
        Author existingAuthor = getAuthorById(author.getId());
        existingAuthor.setName(author.getName());
        existingAuthor.setProfileUrl(author.getProfileUrl());
        repository.save(existingAuthor);
    }

    public void deleteAuthor(Integer id) {
        repository.deleteById(id);
    }
}
