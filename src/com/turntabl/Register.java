package com.turntabl;

import java.util.ArrayList;
import java.util.List;

public class Register {
    List<Nameable> nameables;

    public Register(List<Nameable> nameable){
        this.nameables = nameable;
    }

    public List<String> getRegister(){
        List<String> nameOfStudents = new ArrayList();
        for (Nameable nameable: nameables){
            nameOfStudents.add(nameable.getName());
        }
        return nameOfStudents;
    }
}
