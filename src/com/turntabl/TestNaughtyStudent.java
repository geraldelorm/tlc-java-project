package com.turntabl;

import org.junit.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class TestNaughtyStudent {
    @Test
    public void testNaughtyStudentIsAKindOfStudent(){
        Student student = new Student(List.of(2.0, 1.3, 2.2, 4.5, 0.0));
        NaughtyStudent naughtyStudent = new NaughtyStudent(List.of(2.0, 1.3, 2.2, 4.5, 0.0));

        assertTrue(naughtyStudent instanceof Student);
    }

    @Test
    public void testNaughtyStudentAveGradeIs10TimesStudent(){

        Student student = new Student(List.of(2.0, 1.3, 2.2, 4.5, 0.0));
        NaughtyStudent naughtyStudent = new NaughtyStudent(List.of(2.0, 1.3, 2.2, 4.5, 0.0));

        double studentAveGradeTimes10 = (student.getAverageGrade() + (student.getAverageGrade() * 0.1));
        assertEquals(studentAveGradeTimes10, naughtyStudent.getAverageGrade());
    }
}
