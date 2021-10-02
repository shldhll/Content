package project.content.Content.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import project.content.Content.exception.ErrorCodes;

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

    @NotNull(message = ErrorCodes.ERR_ID_MISSING)
    private int postId;

    @NotNull(message = ErrorCodes.ERR_AUTHOR_MISSING)
    @ManyToOne
    private Author author;

    @NotNull(message = ErrorCodes.ERR_TEXT_MISSING)
    private String text;

    private Date postedAt;
}
