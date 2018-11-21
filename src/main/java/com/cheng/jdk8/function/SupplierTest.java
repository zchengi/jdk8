package com.cheng.jdk8.function;

import java.util.function.Supplier;

/**
 * Supplier: 不接收参数，同时返回一个结果
 * @author cheng
 *         2018/11/18 18:56
 */
public class SupplierTest {
    public static void main(String[] args) {

//        Supplier<String> supplier = () -> "Hello World";
//        System.out.println(supplier.get());

        // 创建一个 Student 对象
        Supplier<Student> supplier = () -> new Student();
        System.out.println(supplier.get().getName());
        System.out.println("----------");

        Supplier<Student> supplier2 = Student::new;
        System.out.println(supplier2.get().getName());
        System.out.println("----------");
    }
}

class Student {

    private String name = "cheng";

    private int age = 20;

    public Student() {
    }

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}