package com.guzichenko.courses.lesson_3_interfaces.domain;

public class Mouse implements USB {

    @Override
    public void connect() {
        System.out.println("Click");
    }
}
