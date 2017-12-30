package com.guzichenko.courses.lesson_4_generics;

public class Main {

    public static void main(String[] args) {
        Generic<Integer> generic = new Generic<>();
        generic.set(3);
        System.out.println(generic.get());


        System.out.println(Generic.getNumeric(2));
    }
}
