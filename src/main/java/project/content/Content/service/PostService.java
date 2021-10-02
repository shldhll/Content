package project.content.Content.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import project.content.Content.model.Post;
import project.content.Content.repository.PostRepository;

import java.util.List;

@Service
public class PostService {
    @Autowired
    private PostRepository repository;

    void addPost(Post post) {
        repository.save(post);
    }

    Post getPostById(Integer id) {
        return repository.findById(id).orElse(null);
    }

    List<Post> getPosts() {
        return repository.findAll();
    }

    void updatePost(Post post) {
        Post existingPost = getPostById(post.getId());
        existingPost.setTitle(post.getTitle());
        existingPost.setAuthors(post.getAuthors());
        existingPost.setText(post.getText());
        repository.save(existingPost);
    }

    void deleteById(Integer id) {
        repository.deleteById(id);
    }
}
