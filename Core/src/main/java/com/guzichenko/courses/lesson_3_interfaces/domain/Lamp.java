package com.guzichenko.courses.lesson_3_interfaces.domain;

public class Lamp implements USB{

    @Override
    public void connect() {
        System.out.println("Light");
    }
}
