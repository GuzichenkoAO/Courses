package com.guzichenko.courses.lesson_2_operators.loop;

public class While {

    public static void main(String[] args) {
        int[] ints = {1, 2, 5, 4, 15, 21, 0};
        for (int i = 0; i < ints.length; i++) {

            int lowest = ints[i];
            for (int j = i + 1; j < ints.length; j++) {
                if (lowest > ints[j]) {
                    int temp = lowest;
                    lowest = ints[j];
                    ints[j] = temp;
                    ints[i] = lowest;
                }
            }
        }


        for (int i : ints) {
            System.out.println(i);
        }
    }

}
