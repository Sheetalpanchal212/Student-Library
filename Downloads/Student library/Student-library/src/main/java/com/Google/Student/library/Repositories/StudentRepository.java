package com.Google.Student.library.Repositories;

import com.Google.Student.library.Models.StudentEntity;
import org.springframework.stereotype.Repository;

import java.util.HashMap;

@Repository
public class StudentRepository {

    private HashMap<Integer, StudentEntity> studentMap;

    public void addStudent(StudentEntity student) {
        studentMap.put(student.getId(), student);
    }

    public StudentRepository() {
        studentMap = new HashMap<>();
    }

    public StudentEntity getStudent(int id) {
        return studentMap.get(id);
    }

    public String updateschoolName(int id, String schoolName) {
        if (studentMap.containsKey(id)) {
            StudentEntity s = studentMap.get(id);
            s.setSchoolName(schoolName);
            studentMap.replace(id, s);
            return "SchoolName Upadated";
        } else
            return "student not found";
    }

    public String deleteStudent(int id) {
        if (studentMap.containsKey(id)) {
            studentMap.remove(id);
            return "Student removed";
        }
        return "Student not found";

    }
}
