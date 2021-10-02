package project.content.Content.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;
import java.util.Date;
import java.util.List;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Post {
    @Id
    private int id;

    @NotNull
    private List<Author> authors;

    @NotNull
    private String title;

    @NotNull
    private String text;

    private Date postedAt;
}
