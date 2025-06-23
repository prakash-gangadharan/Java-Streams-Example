package com.streams.lambda.example;

import java.util.Comparator;
import java.util.Map;
import java.util.LinkedHashMap;
import java.util.HashMap;
import java.util.stream.Collectors;
public class SortHashMapUsingStream {
    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();
        map.put("Apple", 3);
        map.put("Orange",1);
        map.put("Banana",2);

        Map<String, Integer> lhm = map.entrySet()
            .stream()
                .sorted(Map.Entry.comparingByValue(Comparator.reverseOrder()))
                    .collect(Collectors.toMap(
                            Map.Entry::getKey,
                            Map.Entry::getValue,
                            (e1,e2) -> e1,
                            LinkedHashMap::new
                    ));
        lhm.forEach((k, v) -> System.out.println(k + " : " + v));
    }
}
