package com.guzichenko.courses.lesson_3_interfaces;

import com.guzichenko.courses.lesson_3_interfaces.domain.Computer;
import com.guzichenko.courses.lesson_3_interfaces.domain.Lamp;
import com.guzichenko.courses.lesson_3_interfaces.domain.Mouse;

public class Main {

    public static void main(String[] args) {
        Computer computer = new Computer();
        Mouse mouse = new Mouse();
        Lamp lamp = new Lamp();

        computer.connectUsb(mouse);
        computer.connectUsb(lamp);
    }

}
