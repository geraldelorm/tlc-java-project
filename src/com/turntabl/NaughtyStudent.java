package com.turntabl;

import java.util.List;

public class NaughtyStudent extends Student{

    public NaughtyStudent(List<Double> grades) {
        super(grades);
    }

    public double getAverageGrade(){
        double sum = 0;
        for (Double grade: grades){
            sum += grade;
        }

        double averageGrade = sum/grades.size();

        return averageGrade + (averageGrade * 0.1);
    }
}
