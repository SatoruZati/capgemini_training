package com.example.Hibernate_App.controller;

import com.example.Hibernate_App.dao.StudentDAO;
import com.example.Hibernate_App.entity.Student;

public class StudentController {

    public void createStudent() {

        StudentDAO studentDAO = new StudentDAO();

        // Create a new student
        // Student newStudent = new Student("Lewis", "Hamilton", "lewis.hamilton@proton.me", 39, "Male", "Formula 1", "555-1234");
        //studentDAO.save(newStudent);

//        Student student = new Student();
//        student.setFirstName("Lewis");
//        student.setLastName("Hamilton");
//        student.setEmail("lewishamilton@proton.me");
//        student.setAge(39);
//        student.setGender("Male");
//        student.setCourse("Formula 1");
//        student.setPhoneNumber("555-1234");
//
//        studentDAO.save(student);
//
//        Student newStudent = new Student("Max", "Verstappen", "max.verstappen@gmail.com", 27, "Male", "Formula 1", "555-5678");
//        studentDAO.save(newStudent);

        // add a few more records
    Student student1 = new Student("Charles", "Leclerc", "charles.leclerc@gmail.com", 27, "Male", "Formula 1", "555-5678");
    Student student2 = new Student("Sergio", "Perez", "sergio.perez@gmail.com", 32, "Male", "Formula 1", "555-9012");
    Student student3 = new Student("Lando", "Norris", "lando.norris@proton.me", 28, "Male", "Formula 1", "555-3456");
    Student student4 = new Student("Lionel", "Messi", "lionel.messi@gmail.com", 36, "Male", "Football", "555-7890");
    Student student5 = new Student("Cristiano", "Ronaldo", "cristiano.ronaldo@proton.me", 41, "Male", "Football", "555-2345");

    studentDAO.save(student1);
    studentDAO.save(student2);
    studentDAO.save(student3);
    studentDAO.save(student4);
    studentDAO.save(student5);
    }

    // find student by id
    public void findStudentById(int id) {
        StudentDAO studentDAO = new StudentDAO();
        studentDAO.findById(id);
    }

    public static void main(String[] args) {

        StudentController controller = new StudentController();
        controller.createStudent();

        StudentController findController = new StudentController();
        findController.findStudentById(1);
        findController.findStudentById(5);

    }

}
