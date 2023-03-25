package com.badmashcompany108.studentManagement108;

import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.HashMap;

@Repository
public class StudentRepositry {
    HashMap<Integer,Student> db = new HashMap<>();
    public Student getStudent(int id){
        return db.get(id);
    }

    public String addStudent(Student student){
        int id = student.getAdmNo();
        db.put(id,student);
        return "added successfully";
    }

    public String deleteStudent(int admNo){
        db.remove(admNo);
        return "Student Delete";
    }


        public String updateStudent(int id,int age){
        if(db.containsKey(id)){
            return "Invalid Id";
        }

        Student student = db.get(id);
        student.setAge(age);
        db.put(id,student);

        return "Age updated successfully";

    }
}
