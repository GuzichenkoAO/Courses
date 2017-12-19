package com.guzichenko.courses.lesson_3_interfaces.domain;

import java.util.List;

public class Mouse implements USB {

    private String name = "Aaa";

    @Override
    public void connect() {
        System.out.println("Click");
    }


    public int showCharge() {
        return battery.h;
    }

    public class Battery {
        private int charge = 50;
        private int h = 18;
        private int d = 20;
        List list;

        public void print() {
            name = "";
            System.out.println(name);
        }
    }

    private Battery battery = new Battery();


}
