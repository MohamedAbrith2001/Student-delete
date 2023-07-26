package com.mysqldata.Springmysql.Service;

import com.mysqldata.Springmysql.Entity.Student;
import com.mysqldata.Springmysql.Repository.StudentRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StudentService {
    @Autowired
    private StudentRepo studentRepo;

    public Student saveDetails(Student student){

        return studentRepo.save(student);
    }
    public String deleteStudent(int id){

        studentRepo.deleteById(id);
        return "deleted"+id;
    }
}
