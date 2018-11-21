package com.cheng.jdk8.function;

import java.util.Arrays;
import java.util.List;
import java.util.function.BiFunction;
import java.util.stream.Collectors;

/**
 * BiFunction 函数式接口实例演示
 *
 * @author cheng
 *         2018/11/16 15:54
 */
public class BiFunctionTest {
    public static void main(String[] args) {

        Person person1 = new Person("zhangsan", 20);
        Person person2 = new Person("lisi", 30);
        Person person3 = new Person("wangwu", 40);

        List<Person> people = Arrays.asList(person1, person2, person3);

        BiFunctionTest test = new BiFunctionTest();
//        List<Person> res = test.getPersonByUsername("zhangsan", people);
//        res.forEach(person -> System.out.println(person.getUsername()));

//        test.getPersonByAge(20, people).forEach(person -> System.out.println(person.getAge()));

//        List<Person> result = test.getPersonByAge2(10, people, (age, personList) ->
//                personList.stream().filter(person -> person.getAge() > age).collect(Collectors.toList()));
//        result.forEach(person -> System.out.println(person.getAge()));

        List<Person> result2 = test.getPersonByAge2(40, people, (age, personList) ->
                personList.stream().filter(person -> person.getAge() < age).collect(Collectors.toList()));
        result2.forEach(person -> System.out.println(person.getAge()));

    }

    public List<Person> getPersonByUsername(String username, List<Person> people) {
        return people.stream().filter(person -> person.getUsername().equals(username)).collect(Collectors.toList());
    }

    public List<Person> getPersonByAge(int age, List<Person> people) {
        BiFunction<Integer, List<Person>, List<Person>> biFunction =
                (ageOfPerson, personList) ->
                        personList.stream().filter(person -> person.getAge() > ageOfPerson).collect(Collectors.toList());

        return biFunction.apply(age, people);
    }

    public List<Person> getPersonByAge2(int age, List<Person> people,
                                        BiFunction<Integer, List<Person>, List<Person>> biFunction) {
        return biFunction.apply(age, people);
    }
}

class Person {

    private String username;
    private int age;

    public Person(String username, int age) {
        this.username = username;
        this.age = age;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
