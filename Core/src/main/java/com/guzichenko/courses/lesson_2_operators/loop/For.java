package com.guzichenko.courses.lesson_2_operators.loop;

public class For {

    public static void main(String[] args) {

//		for (int i = 0; i < 10; i++) {
//			if (i == 2) continue;
//
//
//			System.out.println(i);
//		}
//
//				int i = 0;
//				for ( ; ; ) {              //infinite
//					i++;
//					System.out.println(i);
//					if (i == 10) {
//						break;
//					}
//				}

//        int i = 0;
//        for (; ; ) {                 //infinite
//            i++;
//            if (i == 4) {
//                continue;
//            }
//            System.out.println(i);
//            if (i == 7)
//                break;
//
//        }

        int[] ints = {1, 3, 2};
        for (int i : ints) {
            System.out.println(i);
        }

    }

}
