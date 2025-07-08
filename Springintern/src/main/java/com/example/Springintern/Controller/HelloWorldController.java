package com.example.Springintern.Controller;

import com.example.Springintern.Service.HelloWorldService;
import com.example.Springintern.models.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/student")
public class HelloWorldController {

    @Autowired
    private HelloWorldService hws;

    @GetMapping
    public List<Student> hello(){
        return hws.getMethod();
    }
    @GetMapping("/{stud_id}")
    public Student getstudentId(@PathVariable int stud_id){
        return hws.getstudentId(stud_id);
    }


    @PostMapping
    public String postMethod(@RequestBody Student student){

        return hws.postMethod(student);
    }

    @PutMapping("/{stud_id}")
    public String updatestudent(@RequestBody Student student){
        return hws.updatestudent(student);
    }
    @DeleteMapping("/{stud_id}")
    public String deletestudentId(@PathVariable int stud_id){
        return hws.deletestudentId(stud_id);
    }
}