package com.badmashcompany108.studentManagement108;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;

@RestController
public class StudentController {

    @Autowired
     StudentService studentService;
    @GetMapping("/get_info")
     public ResponseEntity getStudent(@RequestParam("id") int admNo){

        Student stud = studentService.getStudent(admNo);
        return new ResponseEntity<>(stud, HttpStatus.FOUND);

     }

     @PostMapping("/add")
     public ResponseEntity addStudent(@RequestBody() Student student){
//         db.put(student.getAdmNo(),student);
         String response = studentService.addStudent(student);
         return new ResponseEntity<>(response, HttpStatus.CREATED);
     }

     @DeleteMapping("/delete/{id}")
     public ResponseEntity deleteStudent(@PathVariable("id") int admNo){
         //db.remove(admNo);
         String response = studentService.deleteStudent(admNo);
         return new ResponseEntity<>(response, HttpStatus.FOUND);
     }

     @PutMapping("/update_Student")
     public ResponseEntity updateStudent(@RequestParam("id") int id,@RequestParam("age") int age){

         String response = studentService.deleteStudent(id);
         if(response == null)
         return new ResponseEntity<>(response, HttpStatus.BAD_REQUEST);

         return new ResponseEntity("updated",HttpStatus.ACCEPTED);

     }
}
