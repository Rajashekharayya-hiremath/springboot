package com.raja.service;

import com.raja.model.Student;
import com.raja.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentService {

    @Autowired
    private StudentRepository repo;

    public List<Student> getAllStudents() {
        return repo.findAll();
    }

    public Student addStudent(Student student) {
        return repo.save(student);
    }

    public Student getStudentById(int id) {
        return repo.findById(id).orElse(null);
    }

    public Student updateStudent(int id, Student student) {
        Student existing = repo.findById(id).orElse(null);
        if (existing != null) {
            existing.setName(student.getName());
            existing.setCourse(student.getCourse());
            return repo.save(existing);
        }
        return null;
    }

    public String deleteStudent(int id) {
        repo.deleteById(id);
        return "Deleted Successfully";
    }
}