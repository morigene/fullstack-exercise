package rw.bk.fullstackexercise.fullstackexercise.posts;

import org.springframework.data.jpa.repository.JpaRepository;



public interface PostRepository  extends JpaRepository<Post, Integer> {
}
