package bootiful.springboot4demo;

import org.springframework.stereotype.Service;
import org.springframework.web.service.annotation.GetExchange;
import org.springframework.web.service.annotation.HttpExchange;

import java.util.List;

@HttpExchange(url = "https://jsonplaceholder.typicode.com/posts")
public interface PostService {
    @GetExchange()
    List<Post> getAllPosts();
}
