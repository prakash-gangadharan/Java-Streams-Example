package com.java.learn;

import java.util.*;
import java.util.stream.*;

public class RemoveDuplicatesWhilePreservingOrder {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1, 2, 3, 2, 4, 1, 5, 6, 5);

        List<Integer> lst = list.stream()
                .distinct()
                .collect(Collectors.toList());

        System.out.println(lst);
    }
}
