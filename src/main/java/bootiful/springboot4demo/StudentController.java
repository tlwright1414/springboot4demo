package bootiful.springboot4demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "api/{version}/students", version = "1")
public class StudentController{
    private final StudentService studentService;

    /**
     * Controller for student functions
     * @param studentService
     */
    public StudentController(StudentService studentService) {
        this.studentService = studentService;
    }

    @GetMapping
    public List<Student> getAllStudents() {
        return this.studentService.getAllStudents();
    }
}
