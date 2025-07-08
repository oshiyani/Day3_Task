package com.example.Springintern.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor

public class Student {
    private int stud_id;
    private String name;
    private int roll_no;
    private String dept;



}
