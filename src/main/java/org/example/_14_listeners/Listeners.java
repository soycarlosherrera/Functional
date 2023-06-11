package org.example._14_listeners;

import org.example._06_referenceOperator.NamesUtils;

import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

public class Listeners {
    public static void main(String[] args) {
        List<String> courseList = NamesUtils.getList("Java","FrontEnd","Backend","FullStack");

        Stream<String> courseStream2 = courseList.stream();

        addOperator(
                courseStream2.map(course -> course + "!!")
                        .filter(course -> course.contains("Java")))
                        .forEach(System.out::println);

    }

    static <T> Stream<T> addOperator(Stream<T> stream){
        return stream.peek(data -> System.out.println("Dato: " + data));
    }
}