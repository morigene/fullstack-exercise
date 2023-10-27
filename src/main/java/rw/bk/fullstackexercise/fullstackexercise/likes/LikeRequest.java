package rw.bk.fullstackexercise.fullstackexercise.likes;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Builder
public class LikeRequest {

    private Integer postId;

    private Integer userLike;

}
