package rw.bk.fullstackexercise.fullstackexercise.posts;


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
@Table(name = "_user_posts")
public class Post {

    @Id
    @GeneratedValue
    private Integer id;

    private Integer userId;

    private String posts_text;
}
