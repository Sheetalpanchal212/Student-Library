package com.Google.Student.library.Controller;

import com.Google.Student.library.Models.StudentEntity;
import com.Google.Student.library.Repositories.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class StudentController {
  @Autowired
  StudentRepository studentRepository;
    @GetMapping("/Student/{id}")
    public StudentEntity displayStudent(@PathVariable("id") int id){
        return studentRepository.getStudent(id);
    }
    @PostMapping("/add/Student")
        public String addStudent(@RequestBody StudentEntity student){
        studentRepository.addStudent(student);
        return "Student Added";
    }
    @PutMapping("/updateStudent/{id}")
      public String updateschoolName(@PathVariable("id") int id,@RequestParam String schoolName){
        return studentRepository.updateschoolName(id,schoolName);
    }
    @DeleteMapping("/Student/{id}")
      public String removeId(@PathVariable("id") int id){
        return studentRepository.deleteStudent(id);
    }


}
