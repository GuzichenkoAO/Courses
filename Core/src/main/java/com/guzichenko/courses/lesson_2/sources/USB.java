package com.guzichenko.courses.lesson_2.sources;

public interface USB {

    int i = 10;

    void connectionSuccess();


    default void test(){
        System.out.println("test");
    }

}
