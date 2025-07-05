package com.learn.java8;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class SimpleRunnableExample {

    public static void main(String[] args) {
        //Simple Runnable Example
        Runnable r = () -> System.out.println("Running inside from the runnable...");
        new Thread(r).start();
        //Simple Runnable Example
        Runnable r1 = () -> {
            int a = 10, b = 20;
            System.out.println("Running inside from the runnable..." + (a + b));
        };
        new Thread(r1).start();

        //Creating a Thread with Lambda
        new Thread(() -> System.out.println("Thread with Lambda!")).start();
        //Creating a Thread with Lambda
        new Thread(() -> {
            int c = 5, d = 10;
            System.out.println("Thread run method.. " + (c + d));
        }).start();

        //Iterating the List using Lambda
        List<String> list1 = Arrays.asList("Spring", "Java", "JavaScript", "C++", "Python");
        list1.forEach(lst -> System.out.print(lst + ", "));

        //filtering list using Lambda
        List<String> list2 = list1.stream()
                .filter(s -> s.startsWith("J"))
                .collect(Collectors.toList());
        list2.forEach(System.out::println);

        //sorting a List Using lambda
        List<String> list3 = Arrays.asList("Spring", "Java", "JavaScript", "C++", "Python");
        list3.sort((s1, s2) -> s1.compareTo(s2));
        list3.forEach(System.out::println);

    }

}
