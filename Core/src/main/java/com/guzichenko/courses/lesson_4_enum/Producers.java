package com.guzichenko.courses.lesson_4_enum;

public enum Producers {
    BOSH(3), SAMSUNG(5), PHILIPS(2);

    private int rating;

    Producers(int rating) {
        this.rating = rating;
    }

    public int getRating() {
        return rating;
    }
}
