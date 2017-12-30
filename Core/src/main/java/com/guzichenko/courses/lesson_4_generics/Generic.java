package com.guzichenko.courses.lesson_4_generics;

public class Generic<T> {

    private T a;

    public void set(T a) {
        this.a = a;
    }

    public T get() {
        return a;
    }

    public static <N extends Number> N getNumeric(N object) {
        return object;
    }
}
