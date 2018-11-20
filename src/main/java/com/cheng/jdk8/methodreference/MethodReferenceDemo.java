package com.cheng.jdk8.methodreference;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.Supplier;

/**
 * 方发引用详解
 *
 * @author cheng
 *         2018/11/20 11:38
 */
public class MethodReferenceDemo {

    public String getString(Supplier<String> supplier) {
        return supplier.get() + "test";
    }

    public String getString2(String str, Function<String, String> function) {
        return function.apply(str);
    }

    public static void main(String[] args) {

//        List<String> list = Arrays.asList("hello", "world", "cheng");
//        list.forEach(item -> System.out.println(item));
//        list.forEach(System.out::println);


        Student student1 = new Student("zhang", 60);
        Student student2 = new Student("cheng", 80);
        Student student3 = new Student("zhi", 90);
        Student student4 = new Student("yu", 40);

        List<Student> students = Arrays.asList(student1, student2, student3, student4);

        // lambda表达式
//        students.sort((s1, s2) -> Student.compareStudentByScore(s1, s2));
//        students.sort((s1, s2) -> Student.compareStudentByName(s1, s2));

        // 方法引用 1 类名::静态方法名
//        students.sort(Student::compareStudentByScore);
//        students.sort(Student::compareStudentByName);


        StudentComparator studentComparator = new StudentComparator();
        // lambda表达式
//        students.sort((s1,s2) ->studentComparator.compareStudentByScore(s1,s2));
//        students.sort((s1,s2) ->studentComparator.compareStudentByName(s1,s2));

        // 方法引用 2 引用名（对象名）::实例方法名
//        students.sort(studentComparator::compareStudentByScore);
//        students.sort(studentComparator::compareStudentByName);


        // 方法引用 3 类名::实例方法名
//        students.sort(Student::compareByScore);
//        students.sort(Student::compareByName);

        students.forEach(student -> System.out.println(student.getScore()));
        System.out.println("----------");

        List<String> cities = Arrays.asList("qingdao", "chongqing", "tainjin", "beijing");
//        Collections.sort(cities, (c1, c2) -> c1.compareToIgnoreCase(c2));
//        Collections.sort(cities, String::compareToIgnoreCase);
        cities.sort(String::compareToIgnoreCase);

        cities.forEach(System.out::println);
        System.out.println("----------");


        // 方法引用 4. 构造方法引用
        MethodReferenceDemo methodReferenceDemo = new MethodReferenceDemo();

        System.out.println(methodReferenceDemo.getString(String::new));
        System.out.println(methodReferenceDemo.getString2("cheng", String::new));
    }
}