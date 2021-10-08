package com.turntabl;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Lecture {
    List<Student> students = new ArrayList<>();

    public void enter(Student student){
            students.add(student);
    }

    public double getHighestAverageGrade(){
        List<Double> averages = new ArrayList<>();
        for(Student student: students){
            averages.add(student.getAverageGrade());
        }
        return Collections.max(averages);
    }
}
