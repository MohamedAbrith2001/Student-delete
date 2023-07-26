package com.mysqldata.Springmysql.Controller;

import com.mysqldata.Springmysql.Entity.Student;
import com.mysqldata.Springmysql.Service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class StudentController {

    @Autowired
    public StudentService studentService;

    @PostMapping("/addStudent")
    public Student postDetails(@RequestBody Student student) {
        return studentService.saveDetails(student);

    }
    @DeleteMapping("/deleteStudent/{id}")
    public String deletefunction(@PathVariable int id){
        return studentService.deleteStudent(id);
    }
}
