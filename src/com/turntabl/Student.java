package com.turntabl;

import java.util.ArrayList;
import java.util.List;

public class Student {
    List<Double> grades = new ArrayList<>();

    public Student(List<Double> grades) {
        this.grades = grades;
    }

    double getAverageGrade(){
        double sum = 0;
        for (Double grade: grades){
            sum += grade;
        }
        return sum/grades.size();
    }
}
