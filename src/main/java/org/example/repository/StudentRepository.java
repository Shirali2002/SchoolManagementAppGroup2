package org.example.repository;

import org.example.entity.Student;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class StudentRepository {

    private static final Map<Long, Student> students = new HashMap<>();

    public void addStudent(Student student) {
        students.put(student.getId(), student);
    }

    public Student getById(Long id) {
        return students.get(id);
    }

    public List<Student> getAll() {
        return new ArrayList<>(students.values());
    }

}
