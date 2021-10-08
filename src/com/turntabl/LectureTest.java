package com.turntabl;


import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class LectureTest {
    @Test
    public void testLecture(){
        Student student1 = new Student(List.of(2.0, 1.3, 2.2, 4.5, 0.0));
        Student student2 = new Student(List.of(2.0, 7.3, 2.2, 4.5, 0.0));

        Lecture lecture = new Lecture();
        lecture.enter(student1);
        lecture.enter(student2);

        double highestAve = lecture.getHighestAverageGrade();
        assertEquals(highestAve, 3.2);
    }
}
