package com.guzichenko.courses.lesson_3_inheritance.domain;

public class Car extends Vehicle {

    @Override
    void drive() {
        System.out.println("Be-be!");
    }
}
