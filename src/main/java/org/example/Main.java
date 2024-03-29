package org.example;

import org.example.controller.StudentController;
import org.example.dto.request.AddStudentRequest;
import org.example.dto.response.GetStudentResponse;
import org.example.util.RequestBuilderUtil;

import java.util.List;
import java.util.Scanner;

public class Main {

    private static final StudentController studentController = StudentController.getInstance();

    public static void main(String[] args) {
        // dto -> Data Transfer Object

        // name surname birthdate  10/09/2000
        // fullName birthdate
        while (true) {
            menu();
        }
    }

    private static void menu() {
        System.out.println("""
                ----------------------------------------------------
                Choose your process:
                1. add Student
                2. get All Student""");

        Scanner sc = new Scanner(System.in);
        int choice = sc.nextInt();

        switch (choice) {
            case 1:
                addStudent();
                break;
            case 2:
                getAllStudents();
                break;
            default:
                System.out.println("your choice is not ok for us. please try again.");
        }
    }

    private static void addStudent() {
        AddStudentRequest addStudentRequest = RequestBuilderUtil.buildAddStudentRequest();
        studentController.addStudent(addStudentRequest);
        System.out.println("student added successfully");
    }

    private static void getAllStudents() {
        List<GetStudentResponse> students = studentController.getAllStudents();
        for (GetStudentResponse student: students) {
            System.out.println(student.toString());
        }

    }

}