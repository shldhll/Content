package project.content.Content.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import project.content.Content.exception.ErrorCodes;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Author {
    @Id
    private int id;

    @NotNull(message = ErrorCodes.ERR_NAME_MISSING)
    String name;

    @NotNull(message = ErrorCodes.ERR_AUTHOR_PROFILE_MISSING)
    String profileUrl;
}
