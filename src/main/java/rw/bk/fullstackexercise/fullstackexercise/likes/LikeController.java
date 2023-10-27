package rw.bk.fullstackexercise.fullstackexercise.likes;


import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/like")
@RequiredArgsConstructor
@Tag(name = "User Liking a Post")
public class LikeController {

    public final LikeService service;

    @Operation(
            description = "Give a like to a user post",
            summary = "This is a  summary for user click to like",
            responses = {
                    @ApiResponse(

                            description = "Success - User post is liked",
                            responseCode = "200"
                    ),
                    @ApiResponse(

                            description = "Unauthroized/Invalid token",
                            responseCode = "403"
                    )
            }
    )
    @PostMapping("give-like")
    public ResponseEntity<?> givingLike(
            @RequestBody LikeRequest request
    ) {

        service.saveLike(request);
        return ResponseEntity.accepted().build();
    }


    @Operation(
            description = "View  a like to  a user post",
            summary = "View likes",
            responses = {
                    @ApiResponse(

                            description = "Success",
                            responseCode = "200"
                    ),
                    @ApiResponse(

                            description = "Unauthroized/Invalid token",
                            responseCode = "403"
                    )
            }
    )

    @GetMapping("/list-likes")
    public ResponseEntity<List<Like>> findAllLikes() {
        return ResponseEntity.ok(service.findAll());
    }

}
