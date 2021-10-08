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

    public void printReport(){
//        List<String> FirstYearNames = new ArrayList<>();
//        List<String> SecondYearNames = new ArrayList<>();
//        List<String> ThirdYearNames = new ArrayList<>();
//        List<String> FourthYearNames = new ArrayList<>();
//        for(Student student: students){
//            if(student.getLevel() == HasLevel.Level.FirstYear){
//                FirstYearNames.add(student.getName());
//            } else if(student.getLevel() == HasLevel.Level.SecondYear){
//                SecondYearNames.add(student.getName());
//            } else if (student.getLevel() == HasLevel.Level.ThirdYear){
//                ThirdYearNames.add(student.getName());
//            } else if (student.getLevel() == HasLevel.Level.ForthYear){
//                FourthYearNames.add(student.getName());
//            }
//        }
//        System.out.println("--------------------------------------------");
//        System.out.println(FirstYearNames.stream();
//        }));
//        for(int i = 0; i < 100; i++){
//            System.out.println(FirstYearNames[i] + SecondYearNames[i] + ThirdYearNames[i] + FourthYearNames[i]);
//        }
//        return report;
    }
}
