package rw.bk.fullstackexercise.fullstackexercise.posts;


import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import rw.bk.fullstackexercise.fullstackexercise.user.User;

import java.util.List;

@Service
@RequiredArgsConstructor
public class PostService {
    private final PostRepository repository;
    public void savePost(PostRequest request){

        var post = Post.builder()
                .userId(request.getUserId())
                .posts_text(request.getPosts_text())
                .build();
        repository.save(post);
    }
    public List<Post> findAll(){

        return repository.findAll();
    }
}
