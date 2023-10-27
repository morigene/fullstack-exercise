package rw.bk.fullstackexercise.fullstackexercise.likes;

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
@Table(name = "_user_likes")
public class Like {

    @Id
    @GeneratedValue
    private Integer id;

    private Integer postId;

    private Integer userLike;

    private Integer countedLike;
}
