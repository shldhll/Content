package project.content.Content.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.validation.constraints.NotNull;
import java.util.Date;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Comment {
    @Id
    private int id;

    private int parentId;

    @NotNull
    private int postId;

    @NotNull
    @ManyToOne
    private Author author;

    @NotNull
    private String text;

    private Date postedAt;
}
