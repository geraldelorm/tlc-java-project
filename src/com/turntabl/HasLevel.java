package com.turntabl;

public interface HasLevel {
    enum Level{
        FirstYear, SecondYear, ThirdYear, ForthYear
    }
    public Level getLevel();
}
