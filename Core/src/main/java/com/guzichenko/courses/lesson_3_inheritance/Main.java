package com.guzichenko.courses.lesson_3_inheritance;

import com.guzichenko.courses.lesson_3_inheritance.domain.Bicycle;
import com.guzichenko.courses.lesson_3_inheritance.domain.Car;
import com.guzichenko.courses.lesson_3_inheritance.domain.Driver;

public class Main {

    public static void main(String[] args) {
        Driver driver = new Driver();
        Car car = new Car();
        Bicycle bicycle = new Bicycle();

        driver.ride(car);
        driver.ride(bicycle);
    }


}
