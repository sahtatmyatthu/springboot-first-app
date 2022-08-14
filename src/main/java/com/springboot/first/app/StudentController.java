package com.springboot.first.app;

import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
public class StudentController {

    // http://localhost:8090/student
    @GetMapping("/student")
    public Student getStudent(){
        return new Student("Ramesh", "Fadatare");
    }
    @GetMapping("/students")
    public List<Student> getStudents(){
        List<Student> students = new ArrayList<>();
        students.add(new Student("Ramesh", "Fadatare"));
        students.add(new Student("Tony", "Cena"));
        students.add(new Student("Sanjay", "Jadhav"));
        students.add(new Student("Ram", "Jadhav"));
        return students;

    }

    // http://localhost:8090/student/ramesh/fadatare
    // @PathVariable annotation
    @GetMapping("/student/{firstName}/{lastName}")
    public Student studentPathVariable(@PathVariable("firstName") String firstName,@PathVariable("lastName") String lastName){
        return new Student(firstName, lastName);
    }

    // build rest API to handle query parameters
    //http://localhost:8090/student/query?firstName=nga&lastName=sa
    @GetMapping("/student/query")
    public Student studentQueryParam(@RequestParam(name = "firstName")  String firstName,@RequestParam(name = "lastName") String lastName){
        return new Student(firstName, lastName);
    }
}
