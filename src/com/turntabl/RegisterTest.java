package com.turntabl;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RegisterTest {
    @Test
    public void testRegister(){
        Student student1 = new Student("Kofi");
        Student student2 = new Student("Alex");

        Register register = new Register(List.of(student1, student2));

        List<String> result = new ArrayList<>();
        result.add(student1.getName());
        result.add(student2.getName());

//        System.out.println(result);
//        System.out.println(register.getRegister());

        assertEquals(register.getRegister(), result);
    }

    @Test
    public void testGetRegisterByLevel(){
        Student student1 = new Student("Kofi", HasLevel.Level.FirstYear);
        Student student2 = new Student("Alex", HasLevel.Level.FirstYear);
        Student student3 = new Student("Alex", HasLevel.Level.SecondYear);

        Register register = new Register(List.of(student1, student2, student3));

        List<String> result = new ArrayList<>();
        result.add(student1.getName());
        result.add(student2.getName());

//        System.out.println(result);
//        System.out.println(register.getRegisterByLevel(HasLevel.Level.FirstYear));

        assertEquals(register.getRegisterByLevel(HasLevel.Level.FirstYear), result);

    }

    @Test
    public void testGprintReport() {
        Student student1 = new Student("Kofi", HasLevel.Level.FirstYear);
        Student student2 = new Student("Alex", HasLevel.Level.FirstYear);
        Student student3 = new Student("Alex", HasLevel.Level.SecondYear);

        Register register = new Register(List.of(student1, student2, student3));

        register.printReport();
    }
}
