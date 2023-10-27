package rw.bk.fullstackexercise.fullstackexercise.comments;


import io.swagger.v3.oas.annotations.security.SecurityRequirement;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@CrossOrigin(origins = "http://localhost:8080")
@RestController
@RequestMapping("/api/v1/comment")
@RequiredArgsConstructor
@SecurityRequirement(name ="bearerAuth")
public class CommentController {

    public final CommentService service;

    @PostMapping("/submit-comment")
    public ResponseEntity<?> submitComment(
            @RequestBody CommentRequest request
    ){
        service.saveComment(request);
        return ResponseEntity.accepted()
                .build();
    }

    @GetMapping("list-comments")
    public ResponseEntity<List<Comment>> findAllComments(){

        return ResponseEntity.ok(service.findAll());
    }
}
