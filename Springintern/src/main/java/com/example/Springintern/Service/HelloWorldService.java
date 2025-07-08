package com.example.Springintern.Service;



import com.example.Springintern.models.Student;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class HelloWorldService {
    List<Student> stu = new ArrayList<>(
            Arrays.asList(new Student(1,"Prasath",161,"cse"),
                    new Student(2,"Sheeran", 195, "ece")
            )
    );
    private int stud_id;


    public List<Student> getMethod() {
        return stu;
    }

    public String postMethod(Student student) {
        stu.add(student);
        return "successfully created";
    }
    public String putStudent(){
        return "From put Student";
    }

    public String deleteStudent(){
        return "From delete Student";
    }


    public Student getstudentId(int stud_id) {
        int index = 0;
        boolean flag = false;
        for (int i = 0; i < stu.size(); i++) {
            if (stud_id == stu.get(i).getStud_id()) {
                System.out.println("Stud_Id" + stu.get(i).getStud_id() + stu.get(i));
                index = i;
                flag = true;
                break;
            }
        }
        if (flag) {
            return stu.get(index);
        } else {
            return new Student();
        }
    }


    public String updatestudent(Student student) {
        int index = 0;
        boolean flag = false;
        for (int i = 0; i < stu.size(); i++) {
            if (student.getStud_id() == stu.get(i).getStud_id()) {
                System.out.println("Stud_Id" + stu.get(i).getStud_id() + stu.get(i));
                index = i;
                flag = true;
                break;
            }
        }
        if (flag) {
            stu.set(index,student);
            return "successfully updated";
        } else {
            return "not found id";
        }
    }

    public String deletestudentId(int stud_id) {
        int index = 0;
        boolean flag = false;
        for (int i = 0; i < stu.size(); i++) {
            if (stud_id == stu.get(i).getStud_id()) {
                System.out.println("Emp_Id" + stu.get(i).getStud_id() + stu.get(i));
                index = i;
                flag = true;
                break;
            }
        }
        if (flag) {
            stu.remove(index);
            return "studentid deleted";
        } else {
            return "not found id";
        }
    }
}

