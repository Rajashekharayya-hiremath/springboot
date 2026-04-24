package com.raja.service;

import com.raja.model.Student;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class StudentService {

    List<Student> students = new ArrayList<>();

    public List<Student> getAllStudents() {
        return students;
    }

    public String addStudent(Student student) {
        students.add(student);
        return "Student added";
    }

    public String updateStudent(int id, Student updatedStudent) {
        for (Student s : students) {
            if (s.getId() == id) {
                s.setName(updatedStudent.getName());
                s.setCourse(updatedStudent.getCourse());
                return "Student updated";
            }
        }
        return "Student not found";
    }

    public String deleteStudent(int id) {
        for (int i = 0; i < students.size(); i++) {
            if (students.get(i).getId() == id) {
                students.remove(i);
                return "Student deleted";
            }
        }
        return "Student not found";
    }
}