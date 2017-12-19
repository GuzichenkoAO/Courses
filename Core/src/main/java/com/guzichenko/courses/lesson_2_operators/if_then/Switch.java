package com.guzichenko.courses.lesson_2_operators.if_then;

public class Switch {

    public static void main(String[] args) {
        boolean i = true;

        switch ("") {

            case "":
            case "12":
                System.out.println(6);
                break;
            case "1":
                System.out.println(3);
            default:
                System.out.println("default");
                break;
        }
    }
}
