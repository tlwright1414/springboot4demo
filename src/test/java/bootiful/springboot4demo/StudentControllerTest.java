package bootiful.springboot4demo;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;
import static org.mockito.Mockito.verify;

@ExtendWith(MockitoExtension.class)
class StudentControllerTest {

    @Mock
    private StudentService studentService;

    @InjectMocks
    private StudentController studentController;

    private List<Student> mockStudents;

    @BeforeEach
    void setUp() {
        Student student1 = new Student(1, "John Doe", 40);
        Student student2 = new Student(2, "Jane Smith", 50);
        mockStudents = Arrays.asList(student1, student2);
    }

    @Test
    void getAllStudents_shouldReturnListOfStudents() {
        // Arrange
        when(studentService.getAllStudents()).thenReturn(mockStudents);

        // Act
        List<Student> result = studentController.getAllStudents();

        // Assert
        assertEquals(2, result.size());
        assertEquals("John Doe", result.getFirst().name());
        verify(studentService).getAllStudents();
    }
}