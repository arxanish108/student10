package com.badmashcompany108.studentManagement108;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;

@RestController
public class StudentController {

    @Autowired
     StudentService studentService;
    @GetMapping("/get_info")
     public Student getStudent(@RequestParam("id") int admNo){

        return studentService.getStudent(admNo) ;
     }

     @PostMapping("/add")
     public String addStudent(@RequestBody() Student student){
//         db.put(student.getAdmNo(),student);
         return studentService.addStudent(student);
     }

     @DeleteMapping("/delete/{id}")
     public String deleteStudent(@PathVariable("id") int admNo){
         //db.remove(admNo);
         return studentService.deleteStudent(admNo);
     }

     public String updateStudent(@RequestParam("id") int id,@RequestParam("age") int age){
//         if(db.containsKey(id)){
//             return "Invalid Id";
//         }
//
//             Student student = db.get(id);
//             student.setAge(age);
//             db.put(id,student);

             return studentService.updateStudent(id, age);

     }
}
