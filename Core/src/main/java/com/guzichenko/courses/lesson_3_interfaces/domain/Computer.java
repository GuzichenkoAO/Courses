package com.guzichenko.courses.lesson_3_interfaces.domain;

public class Computer {

    private USB usb;

    public void connectUsb(USB device) {
        this.usb = device;
        usb.connect();
    }

}
