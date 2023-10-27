package rw.bk.fullstackexercise.fullstackexercise.likes;


import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class LikeService {
   public final LikeRepository repository;

    public void saveLike(LikeRequest request){
        var like = Like.builder()
                .postId(request.getPostId())
                .userLike(request.getUserLike())
                .build();
        repository.save(like);
    }

    public List<Like> findAll(){
        return repository.findAll();
    }
}
