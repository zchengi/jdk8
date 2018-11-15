package com.cheng.jdk8;

/**
 * @author cheng
 *         2018/11/15 17:15
 */
@FunctionalInterface
interface MyInterface {

    void test();

    //    String myString();
    String toString();
}

public class Test2 {
    public void myTest(MyInterface myInterface) {
        myInterface.test();
        System.out.println(2);
    }

    public static void main(String[] args) {

        Test2 test2 = new Test2();
        test2.myTest(() -> {
            System.out.println("myTest");
        });

        System.out.println("----------");

        MyInterface myInterface = () -> {
            System.out.println("hello");
        };
        System.out.println(myInterface.getClass());
        System.out.println(myInterface.getClass().getSuperclass());
        System.out.println(myInterface.getClass().getInterfaces()[0]);
    }
}