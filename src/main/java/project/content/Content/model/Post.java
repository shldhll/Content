package project.content.Content.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import project.content.Content.exception.ErrorCodes;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.util.Date;
import java.util.List;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Post {
    @Id
    private int id;

    @NotNull(message = ErrorCodes.ERR_AUTHOR_MISSING)
    @ManyToMany
    @Size(min = 1, message = ErrorCodes.ERR_AUTHOR_LIST_EMPTY)
    private List<Author> authors;

    @NotNull(message = ErrorCodes.ERR_TITLE_MISSING)
    private String title;

    @NotNull(message = ErrorCodes.ERR_TEXT_MISSING)
    private String text;

    private Date postedAt;
}
