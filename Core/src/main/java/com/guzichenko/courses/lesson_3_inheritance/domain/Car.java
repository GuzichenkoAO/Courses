package com.guzichenko.courses.lesson_3_inheritance.domain;

import com.guzichenko.courses.lesson_4.MyException;

public class Car extends Vehicle {

    @Override
    void drive() {
        System.out.println("Be-be!");
    }

    @Override
    void test(){

    }
}
