package com.campus.app;

import com.campus.model.Student;
import com.campus.service.StudentService;
import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //input from users
        System.out.println("Enter Student id: ");
        int studentid = sc.nextInt();
        System.out.println("Enter Student name: ");
        String studentname = sc.next();
        System.out.println("Enter Student age: ");
        int age = sc.nextInt();
        System.out.println("Enter student Department: ");
        String department = sc.next();
        System.out.println("Number of subjects: ");
        int n=sc.nextInt();
        int[] marks = new int[n];
        for(int i=0;i<n;i++){
            System.out.println("Enter marks for subject "+(i+1));
            marks[i] = sc.nextInt();
            sc.nextLine();// Consume the newline character
        }
        Student student = new Student(studentid, studentname, age, department, marks);
        student.displayStudentInfo(true);
        Student.displayStudentCount();
        StudentService studentService = new StudentService();
        studentService.displayReportCard(student);
        sc.close();


    }
}