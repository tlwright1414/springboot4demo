package bootiful.springboot4demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "api/{version}/posts", version = "1")
public class PostController {
    private final PostService postService;

    public PostController(PostService postService) {

        this.postService = postService;
    }

    @GetMapping
    public List<Post> getAllPosts() {
        return this.postService.getAllPosts();
    }
}
