package com.java.learn;

import java.util.Map;
import java.util.LinkedHashMap;
import java.util.HashMap;
import java.util.stream.Collectors;

public class SortHashMapUsingStream {
    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();
        map.put("Apple", 3);
        map.put("Orange", 1);
        map.put("Banana", 2);

        // comparingByKey
        Map<String, Integer> lhm = map.entrySet()
                .stream()
                .sorted(Map.Entry.<String, Integer>comparingByKey().reversed())
                .collect(Collectors.toMap(
                        Map.Entry::getKey,
                        Map.Entry::getValue,
                        (e1, e2) -> e1,
                        LinkedHashMap::new
                ));

        lhm.forEach((k, v) -> System.out.println(k + " : " + v));

        //comparingByValue
        Map<String, Integer> lhm1 = map.entrySet()
                .stream()
                .sorted(Map.Entry.<String, Integer>comparingByValue().reversed())
                .collect(Collectors.toMap(
                        Map.Entry::getKey,
                        Map.Entry::getValue,
                        (e1, e2) -> e1,
                        LinkedHashMap::new
                ));

        lhm1.forEach((k, v) -> System.out.println(k + " : " + v));

    }
}
