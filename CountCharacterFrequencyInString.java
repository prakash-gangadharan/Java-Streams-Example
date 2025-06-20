import java.util.*;
import java.util.stream.*;
import java.util.function.*;

public class CountCharacterFrequencyInString {
    public static void main(String[] args) {

        String str = "Java is a Programming language";

        Map<String, Long> map = Arrays.stream(str.split(""))
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));

        map.forEach((k, v) -> System.out.println(k + " : " + v));

        IntStream charStream = str.chars();
        Map<Character, Long> hm = charStream
                .mapToObj(c -> (char) c)
                .collect(Collectors.groupingBy(s -> s, Collectors.counting()));

        hm.forEach((k, v) -> System.out.println(k + " : " + v));
    }

}
