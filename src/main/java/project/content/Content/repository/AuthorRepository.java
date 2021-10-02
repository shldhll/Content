package project.content.Content.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import project.content.Content.model.Author;

@Repository
public interface AuthorRepository extends JpaRepository<Author, Integer> {
}
