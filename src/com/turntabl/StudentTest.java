package com.turntabl;

import org.junit.Test;

import java.util.List;

import static org.junit.Assert.assertEquals;

public class StudentTest {

    @Test
    public void testStudents(){
        Student student = new Student(List.of(2.0, 1.3, 2.2, 4.5, 0.0));
        assertEquals(student.getAverageGrade(), 2.0, 0);
    }

}