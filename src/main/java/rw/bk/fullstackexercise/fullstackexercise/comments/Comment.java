package rw.bk.fullstackexercise.fullstackexercise.comments;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "_user_comments")
public class Comment {


    @Id
    @GeneratedValue
    private Integer id;

    private Integer postId;

    private String userComment;
}
