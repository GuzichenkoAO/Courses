package com.guzichenko.courses.lesson_4;

public class Product {

    public void test(int i) throws Exception {

        if (i == 0) {
            throw new MyException();
        }
        throw new MyException2();

    }

}
