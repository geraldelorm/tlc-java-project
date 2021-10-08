package com.turntabl;

import org.junit.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertFalse;

public class NaughtyStudentTest {
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

    @Test
    public void testThatNaughtyStudentsAreScoringHigherThanTheyShould(){
        Lecture lecture = new Lecture();

        NaughtyStudent naughtyStudent1 = new NaughtyStudent(List.of(2.0, 1.3, 2.2, 4.5, 0.0));
        NaughtyStudent naughtyStudent2 = new NaughtyStudent(List.of(2.0, 2.3, 2.2, 4.5, 0.0));

        lecture.enter(naughtyStudent1);
        lecture.enter(naughtyStudent2);

        assertFalse(lecture.getHighestAverageGrade() == 2.2);

    }
}
