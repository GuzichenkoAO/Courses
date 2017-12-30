package com.guzichenko.courses.lesson_5_collections;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        Set<String> set = new TreeSet<>(new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return 0;
            }
        });
        Queue<String> queue = new PriorityQueue<>();

        Map<Long, String> map = new HashMap<>();

        map.put(122L, "Cat");
        map.put(123L, "Dog");

        System.out.println(map.keySet());
        System.out.println(map.values());
        System.out.println(map);


    }


}
