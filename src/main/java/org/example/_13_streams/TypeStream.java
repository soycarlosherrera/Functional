package org.example._13_streams;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class TypeStream {
    public static void main(String[] args) {
        IntStream infiniteStream = IntStream.iterate(0, x -> x + 1);
        infiniteStream.limit(1000)
                .parallel()
                .filter(x -> x % 2 == 0)
                .forEach(System.out::println);

        IntStream infiniteStream2 = IntStream.iterate(0, x -> x + 1);
        List<Integer> numberList = infiniteStream2.limit(1000)
                .filter(x -> x % 2 == 0)
                .boxed()
                .collect(Collectors.toList());
    }
}
