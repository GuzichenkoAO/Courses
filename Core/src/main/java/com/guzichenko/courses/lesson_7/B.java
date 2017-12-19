package com.guzichenko.courses.lesson_7;

import java.time.ZoneId;
import java.util.Date;
import java.util.TimeZone;

public class B {

    static {
        TimeZone.setDefault(TimeZone.getTimeZone(ZoneId.of("Europe/Paris")));
    }

    public void show(Date date){
        System.out.println(date);
    }

}
