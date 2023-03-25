package com.badmashcompany108.studentManagement108;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StudentService {

    @Autowired
    StudentRepositry studentRepositry;

    public String addStudent(Student student){
        return studentRepositry.addStudent(student);
    }

    public String deleteStudent(int id){
        //
        return studentRepositry.deleteStudent(id);
    }

    public String updateStudent(int id,int age){
        return studentRepositry.updateStudent(id,age);
    }

    public Student getStudent(int id){
        return studentRepositry.getStudent(id);
    }

}
