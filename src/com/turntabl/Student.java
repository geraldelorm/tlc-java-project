package com.turntabl;

import java.util.ArrayList;
import java.util.List;

public class Student implements Nameable, HasLevel{
    private String name;
    List<Double> grades;
    private Level level;

    public Student(List<Double> grades) {
        this.grades = grades;
    }

    public Student(String name){
        this.name = name;
    }

    public Student(Level level){
        this.level = level;
    }

    public Student(String name, Level level){
        this.name = name;
        this.level = level;
    }

    public double getAverageGrade(){
        double sum = 0;
        for (Double grade: grades){
            sum += grade;
        }
        double averageGrade = sum/grades.size();
        return averageGrade;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public Level getLevel() {
        return level;
    }
}
