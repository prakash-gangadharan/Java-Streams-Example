package com.learn.java8;

import java.util.stream.Collectors;
import java.util.List;
import java.util.Map;
import java.util.Arrays;

public class SumTransactionAmountsForEachDay {
    public static void main(String[] args) {
        List<Transaction> transactions = Arrays.asList(
                new Transaction("2022-01-01", 100),
                new Transaction("2022-01-01", 200),
                new Transaction("2022-01-02", 300),
                new Transaction("2022-01-02", 400),
                new Transaction("2022-01-03", 500)
        );

        Map<String, Integer> map = transactions.stream()
                .collect(Collectors.groupingBy(Transaction::getDate,
                        Collectors.summingInt(Transaction::getAmount)));
        System.out.println(map);
        // {2022-01-03=500, 2022-01-01=300, 2022-01-02=700}

        map.forEach((k, v) -> System.out.println(k+ " : " +v));
    }
}

class Transaction {
    String date;
    Integer amount;

    public String getDate() {
        return date;
    }

    public Integer getAmount() {
        return amount;
    }

    public Transaction(String date, Integer amount) {
        this.date = date;
        this.amount = amount;
    }
}
