import java.util.*;
import java.util.stream.*;
import java.util.function.*;

public class FindWordFrequencyInAList {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("apple", "banana", "apple", "cherry",
                "banana", "apple", "grapes", "orange", "cherry");

        Map<String, Long> map = list.stream()
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));

        map.forEach((k, v) -> System.out.println(k + " : " + v));
    }
}
