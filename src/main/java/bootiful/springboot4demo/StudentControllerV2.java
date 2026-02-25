package bootiful.springboot4demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "api/{version}/students", version = "2")
public class StudentControllerV2 {

    @GetMapping
    public List<Student> getAllStudents() {
        return List.of(
                new Student(1, "asdf", 10),
                new Student(2, "qwer", 11),
                new Student(3, "rtyu", 12));
    }
}
