package project.content.Content.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import project.content.Content.model.Comment;
import project.content.Content.repository.CommentRepository;

import java.util.List;

@Service
public class CommentService {
    @Autowired
    private CommentRepository repository;

    void addComment(Comment comment) {
        repository.save(comment);
    }

    Comment getCommentById(Integer id) {
        return repository.findById(id).orElse(null);
    }

    List<Comment> getComments() {
        return repository.findAll();
    }

    void updateComment(Comment comment) {
        Comment existingComment = getCommentById(comment.getId());
        existingComment.setText(comment.getText());
        repository.save(existingComment);
    }

    void deleteById(Integer id) {
        repository.deleteById(id);
    }
}
