package project.content.Content.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;
import project.content.Content.model.Post;
import project.content.Content.service.PostService;

import javax.validation.Valid;
import java.util.List;

@Validated
@RestController
@RequestMapping("/post")
public class PostController {
    @Autowired
    private PostService service;

    @PostMapping
    public Post addPost(@RequestBody @Valid Post post) {
        return service.addPost(post);
    }

    @GetMapping("/{id}")
    public Post getPostById(@PathVariable Integer id) {
        return service.getPostById(id);
    }

    @GetMapping
    public List<Post> getPosts() {
        return service.getPosts();
    }

    @PutMapping
    public Post updatePost(@RequestBody @Valid Post post) {
        return service.updatePost(post);
    }

    @DeleteMapping
    public String deletePost(@PathVariable Integer id) {
        service.deleteById(id);
        return "post deleted";
    }
}
