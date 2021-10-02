package project.content.Content.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;
import project.content.Content.model.Comment;
import project.content.Content.service.CommentService;

import javax.validation.Valid;
import java.util.List;

@Validated
@RestController
@RequestMapping("/comment")
public class CommentController {
    @Autowired
    private CommentService service;

    @PostMapping
    public Comment addComment(@RequestBody @Valid Comment comment) {
        return service.addComment(comment);
    }

    @GetMapping("/post/{id}")
    public List<Comment> getCommentsByPostId(@PathVariable Integer postId) {
        return service.getCommentsByPostId(postId);
    }

    @GetMapping("/{id}")
    public Comment getCommentById(@PathVariable Integer id) {
        return service.getCommentById(id);
    }

    @PutMapping
    public Comment updateComment(@RequestBody @Valid Comment comment) {
        return service.updateComment(comment);
    }

    @DeleteMapping("/{id}")
    public String deleteComment(@PathVariable Integer id) {
        service.deleteComment(id);
        return "comment deleted";
    }
}
