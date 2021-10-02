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

    public Comment addComment(Comment comment) {
        return repository.save(comment);
    }

    public Comment getCommentById(Integer id) {
        return repository.findById(id).orElse(null);
    }

    public List<Comment> getCommentsByPostId(Integer postId) {
        return repository.findByPostId(postId);
    }

    public Comment updateComment(Comment comment) {
        Comment existingComment = getCommentById(comment.getId());
        existingComment.setText(comment.getText());
        return repository.save(existingComment);
    }

    public void deleteComment(Integer id) {
        repository.deleteById(id);
    }
}
