package com.streams.lambda.example;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class SimpleRunnableExample {

    public static void main(String[] args) {
        //Simple Runnable Example
        Runnable r = () -> System.out.println("Running inside from the runnable...");
        new Thread(r).start();

        //Iterating the List using Lambda
        List<String> list1 = Arrays.asList("Java", "JavaScript", "Python");
        list1.forEach(lst -> System.out.println(lst));
        
        List<String> list2 = list1.stream()
                .filter(s -> s.startsWith("J"))
                .collect(Collectors.toList());
        list2.forEach(System.out::println);
    }
}
