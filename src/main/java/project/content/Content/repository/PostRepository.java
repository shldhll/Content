package project.content.Content.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import project.content.Content.model.Post;

@Repository
public interface PostRepository extends JpaRepository<Post, Integer> {
}
