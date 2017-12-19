package com.guzichenko.courses.lesson_2.sources;

public class Mouse implements USB{
    @Override
    public void connectionSuccess() {
        System.out.println("Tudun");
    }

//    @Override
//    public void test() {
//        System.out.println("Mouse");
//    }
}
