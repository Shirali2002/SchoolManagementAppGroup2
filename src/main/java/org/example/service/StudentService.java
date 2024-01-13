package org.example.service;

import org.example.dto.request.AddStudentRequest;
import org.example.dto.response.GetStudentResponse;
import org.example.entity.Student;
import org.example.mapper.StudentMapper;
import org.example.repository.StudentRepository;
import org.example.util.IdBuilderUtil;

import java.util.List;

public class StudentService {

    private final StudentRepository studentRepository = new StudentRepository();
    private final StudentMapper studentMapper = new StudentMapper();

    public void addStudent(AddStudentRequest request) {
        Student student = studentMapper.toStudent(request);
        student.setId(IdBuilderUtil.getNewId());

        studentRepository.addStudent(student);
    }

    public List<GetStudentResponse> getAllStudents() {
        List<Student> students = studentRepository.getAll();
        return studentMapper.toGetStudentResponseList(students);
    }

}
