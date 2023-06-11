package org.example._13_streams;

import org.example._06_referenceOperator.NamesUtils;

import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

public class Streams {
    public static void main(String[] args) {
        List<String> courseList = NamesUtils.getList("Java","FrontEnd","Backend","FullStack");

        for (String course:courseList) {

            System.out.println("Carlos: " + course);
            String newCourseName = course.toLowerCase().replace("!","!!");
            System.out.println(newCourseName);
        }

        Stream<String> coursesStream =Stream.of("Java","FrontEnd","Backend","FullStack");

        //Stream<Integer> courseLengthStream = coursesStream.map(course -> course.length());

        //Optional<Integer> longest = courseLengthStream.max((x, y)-> y-x);

        Stream<String> emphasisCourses = coursesStream.map(course -> course + "!");

        Stream<String> justJavaCourses = emphasisCourses.filter(course -> course.contains("Java"));

        justJavaCourses.forEach(System.out::println);

    }
}
