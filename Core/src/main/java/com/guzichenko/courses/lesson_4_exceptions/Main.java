package com.guzichenko.courses.lesson_4_exceptions;

import com.guzichenko.courses.lesson_4_exceptions.exceptions.MyCheckedException;
import com.guzichenko.courses.lesson_4_exceptions.exceptions.MyUncheckedException;

public class Main {

    public static void main(String[] args) {
        try {
            throwChecked();
        } catch (MyCheckedException e) {
            System.out.println("Handle Exception!");
        }
        throwUnchecked();

    }


    private static void throwChecked() throws MyCheckedException {

        throw new MyCheckedException("Catch me!!!");

    }

    private static void throwUnchecked() {
        throw new MyUncheckedException("You do not need to catch me!!!");

    }

}
