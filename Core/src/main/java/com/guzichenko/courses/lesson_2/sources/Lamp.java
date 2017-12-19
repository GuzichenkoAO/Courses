package com.guzichenko.courses.lesson_2.sources;

public class Lamp implements USBbas {

    @Override
    public void connectionSuccess() {
        System.out.println("Click");
    }

    @Override
    public void test() {

    }

    @Override
    public int test(Runnable str) {
        return 0;
    }
}
