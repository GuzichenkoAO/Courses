package com.guzichenko.courses.lesson_3_inheritance.domain;

public class Bicycle extends Vehicle{


    @Override
    void drive() {
        System.out.println("Dzin-dzin!");
    }
}
