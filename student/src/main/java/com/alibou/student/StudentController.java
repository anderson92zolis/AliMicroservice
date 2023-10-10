package com.alibou.student;

import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/students")
@RequiredArgsConstructor
public class StudentController {

    private final StudentService studentService;
    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public void save(
            @RequestBody Student student
    ){
        studentService.saveStudent(student);
    }

    @GetMapping
    public ResponseEntity<List<Student>> findAllStudent() {
        return ResponseEntity.ok(studentService.findAllStudent());
    }

    @GetMapping("/school/{school-id}")
    public ResponseEntity<List<Student>> findAllStudentsBySchool(
            @PathVariable("school-id") Integer schoolId
    ) {
        return ResponseEntity.ok(studentService.findAllStudentsBySchool(schoolId));
    }


}