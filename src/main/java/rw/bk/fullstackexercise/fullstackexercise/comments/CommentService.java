package rw.bk.fullstackexercise.fullstackexercise.comments;


import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class CommentService {

    private final CommentRepository repository;

    public void saveComment(CommentRequest request){

        var comment = Comment.builder()
                .postId(request.getPostId())
                .userComment(request.getUserComment())
                .build();

        repository.save(comment);
    }

    public List<Comment> findAll(){
        return repository.findAll();
    }
}
