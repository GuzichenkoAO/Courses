package com.guzichenko.courses.lesson_2.sources;

public class Computer {

    private USB usb;
    private USBbas usbbas;

    public void connect(USB usb){
        this.usb = usb;
        this.usb.connectionSuccess();
    }
    public void connect1(USBbas usb){
        this.usbbas = usb;
        this.usbbas.test();
    }



}
