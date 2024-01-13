package org.example.util;

import org.example.dto.request.AddStudentRequest;

import java.util.Scanner;

public class RequestBuilderUtil {

    public static AddStudentRequest buildAddStudentRequest() {
        Scanner sc = new Scanner(System.in);

        System.out.println("please enter student name:");
        String name = sc.nextLine();

        System.out.println("please enter student surname:");
        String surname = sc.nextLine();

        System.out.println("please enter student birthDate(in day/month/year format):");
        String birthdate = sc.nextLine();

        AddStudentRequest addStudentRequest = new AddStudentRequest();
        addStudentRequest.setName(name);
        addStudentRequest.setSurname(surname);
        addStudentRequest.setBirthDate(birthdate);

        return addStudentRequest;
    }

}
