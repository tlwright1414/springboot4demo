package bootiful.springboot4demo;

import bootiful.springboot4demo.Student;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class StudentServiceTest {

    private final StudentService studentService = new StudentService();

    @Test
    void getAllStudents_shouldReturnThreeStudents() {
        // Act
        List<Student> students = studentService.getAllStudents();

        // Assert
        assertNotNull(students);
        assertEquals(3, students.size());
    }

    @Test
    void getAllStudents_shouldReturnExpectedStudents() {
        // Act
        List<Student> students = studentService.getAllStudents();

        // Assert first student
        Student first = students.get(0);
        assertEquals(1, first.id());
        assertEquals("Foo", first.name());
        assertEquals(10, first.age());

        // Assert second student
        Student second = students.get(1);
        assertEquals(2, second.id());
        assertEquals("Bar", second.name());
        assertEquals(11, second.age());

        // Assert third student
        Student third = students.get(2);
        assertEquals(3, third.id());
        assertEquals("Travis", third.name());
        assertEquals(12, third.age());
    }

    @Test
    void getAllStudents_shouldReturnImmutableList() {
        // Act
        List<Student> students = studentService.getAllStudents();

        // Assert immutability (List.of() is immutable)
        assertThrows(UnsupportedOperationException.class,
                () -> students.add(new Student(4, "New", 13)));
    }
}