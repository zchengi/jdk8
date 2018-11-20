package com.cheng.jdk8.defaultmethod;

/**
 * @author cheng
 *         2018/11/20 12:32
 */
//public class MyClass implements MyInterface1, MyInterface2 {
public class MyClass extends MyInterfaceImpl implements MyInterface2 {

//    @Override
//    public void myMethod() {
//        MyInterface2.super.myMethod();
//        System.out.println("myClass");
//    }

    public static void main(String[] args) {

        MyClass myClass = new MyClass();
        myClass.myMethod();
    }
}
