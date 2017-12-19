package com.guzichenko.courses.lesson_3_interfaces;

import com.guzichenko.courses.lesson_2.sources.Vehicle;
import com.guzichenko.courses.lesson_3_interfaces.domain.Computer;

public class Main {

    public static void main(String[] args) {
        Computer computer = new Computer();

        Vehicle vehicle = new Vehicle() {
            public void drive() {
            }

            public void drive1() {
            }

            public void drive2() {
            }
        };
    }

}
