package rw.bk.fullstackexercise.fullstackexercise.posts;


import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/posts")
@RequiredArgsConstructor
public class PostController {

   public final  PostService service;


    @PostMapping("/submit-post")
    public ResponseEntity<?> submitPost(
            @RequestBody PostRequest request
    ){

        service.savePost(request);
        return ResponseEntity.accepted()
                .build();
    }


    @GetMapping("/list-posts")
    public ResponseEntity<List<Post>> findAllPosts(){

        return ResponseEntity.ok(service.findAll());
    }
}
