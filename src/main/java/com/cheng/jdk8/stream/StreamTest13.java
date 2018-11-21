package com.cheng.jdk8.stream;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * @author cheng
 *         2018/11/21 14:55
 */
public class StreamTest13 {

    public static void main(String[] args) {

        Student student1 = new Student("zhang", 20, 100);
        Student student2 = new Student("li", 20, 90);
        Student student3 = new Student("wang", 30, 90);
        Student student4 = new Student("zhang", 40, 80);

        List<Student> students = Arrays.asList(student1, student2, student3, student4);

//        Map<String, List<Student>> map = students.stream().collect(Collectors.groupingBy(Student::getName));

//        Map<Integer, List<Student>> map = students.stream().collect(Collectors.groupingBy(Student::getScore));

        // select name, count(*) from students group by name;
//        Map<String, Long> map = students.stream().collect(Collectors.groupingBy(Student::getName, Collectors.counting()));

//        Map<String, Double> map = students.stream().collect(Collectors.groupingBy(Student::getName, Collectors.averagingDouble(Student::getScore)));


        Map<Boolean, List<Student>> map = students.stream().collect(Collectors.partitioningBy(student -> student.getScore() >= 90));

        System.out.println(map);
    }
}