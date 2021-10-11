package com.turntabl;

import java.util.*;

public class BagOfStudents{

    private List<Student> bag = new ArrayList<>();

    public void addStudent(Student student) {
        bag.add(student);
    }

    public void removeStudent(String student) {
        bag.remove(student);
    }

    public void clearBag(){
        bag.clear();
    }
}
