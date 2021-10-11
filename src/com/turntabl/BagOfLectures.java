package com.turntabl;

import java.util.ArrayList;
import java.util.List;

public class BagOfLectures {
    List<Lecture> bagOflecture = new ArrayList<>();

    public void addLecture(Lecture lecture) {
        bagOflecture.add(lecture);
    }

    public void removeStudent(Lecture lecture) {
        bagOflecture.remove(lecture);
    }

    public void clearBag(){
        bagOflecture.clear();
    }
}
