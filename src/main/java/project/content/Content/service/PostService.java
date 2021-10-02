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

    public Post addPost(Post post) {
        return repository.save(post);
    }

    public Post getPostById(Integer id) {
        return repository.findById(id).orElse(null);
    }

    public List<Post> getPosts() {
        return repository.findAll();
    }

    public Post updatePost(Post post) {
        Post existingPost = getPostById(post.getId());
        existingPost.setTitle(post.getTitle());
        existingPost.setAuthors(post.getAuthors());
        existingPost.setText(post.getText());
        return repository.save(existingPost);
    }

    public void deletePost(Integer id) {
        repository.deleteById(id);
    }
}
