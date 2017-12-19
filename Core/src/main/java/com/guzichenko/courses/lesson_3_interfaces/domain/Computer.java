package com.guzichenko.courses.lesson_3_interfaces.domain;

public class Computer {

    private USB usb;

    public USB getUsb() {
        return usb;
    }

    public void setUsb(USB usb) {
        this.usb = usb;
    }

    public void connectUsb(USB device) {
        this.usb = device;
        usb.connect();
    }

}
