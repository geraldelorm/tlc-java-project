package com.turntabl;

import java.util.ArrayList;
import java.util.List;

public class Register {
    List<Student> students;

    public Register(List<Student> students){
        this.students = students;
    }

    public List<String> getRegister(){
        List<String> nameOfStudents = new ArrayList();
        for (Student student: students){
            nameOfStudents.add(student.getName());
        }
        return nameOfStudents;
    }

    public List<String> getRegisterByLevel(HasLevel.Level level){
        List<String> nameOfStudentsAtLevel = new ArrayList();
        for (Student student: students){
            if(student.getLevel() == level) {
                nameOfStudentsAtLevel.add(student.getName());
            }
        }
        return nameOfStudentsAtLevel;
    }

    public String printReport(){
        String formatted = "-----------------------------------" + "\n";
        List<String> F = new ArrayList<>();
        List<String> S = new ArrayList<>();
        List<String> T = new ArrayList<>();
        List<String> FH = new ArrayList<>();

        for (Student student: students){
            if(student.getLevel() == HasLevel.Level.FirstYear){
                F.add(student.getName());
            }else if (student.getLevel() == HasLevel.Level.SecondYear){
                S.add(student.getName());
            }else if (student.getLevel() == HasLevel.Level.ThirdYear){
                T.add(student.getName());
            } else if (student.getLevel() == HasLevel.Level.ForthYear){
                FH.add(student.getName());
            }
        }
        formatted += "First Year" + "\n";
        for (String n: F){
            formatted += n + "\n";
        }

        formatted += "\n";

        formatted += "------------------" + "\n";
        formatted += "Second Year" + "\n";
        for (String n: S){
            formatted += n + "\n" ;
        }

        formatted += "\n";

        formatted += "------------------" + "\n";
        formatted += "Third Year" + "\n";
        for (String n: T){
            formatted += n + "\n";
        }

        formatted += "\n";

        formatted += "------------------" + "\n";
        formatted += "Fourth Year" + "\n";
        for (String n: FH){
            formatted += n + "\n";
        }

        return formatted;
    }
}
