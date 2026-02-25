package bootiful.springboot4demo;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentService {

    public List<Student> getAllStudents() {
        return List.of(
                new Student(1, "Foo", 10),
                new Student(2, "Bar", 11),
                new Student(3, "Travis", 12));
    }
}
