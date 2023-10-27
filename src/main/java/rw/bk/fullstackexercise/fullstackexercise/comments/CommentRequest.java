package rw.bk.fullstackexercise.fullstackexercise.comments;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Builder
public class CommentRequest {

    private Integer postId;

    private String userComment;
}
