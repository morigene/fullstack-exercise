package rw.bk.fullstackexercise.fullstackexercise.posts;


import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class PostRequest {

    private Integer userId;
    private String posts_text;


}
