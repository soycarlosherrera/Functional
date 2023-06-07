package org.example._06_referenceOperator;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class NamesUtils {

    public static void main(String[] args) {

        List<String> profesores = getList("Carlos","Mario","Herrera");

        Consumer<String> printer = text -> System.out.println(text);
        profesores.forEach(printer);

        System.out.println("////////////////////////////////////////");

        profesores.forEach(System.out::println);

    }

    static <T>List<T> getList (T... elements ){
        return Arrays.asList(elements);
    }

}
