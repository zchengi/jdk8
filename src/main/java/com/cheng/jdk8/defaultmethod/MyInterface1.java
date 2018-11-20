package com.cheng.jdk8.defaultmethod;

/**
 * @author cheng
 *         2018/11/20 12:32
 */
public interface MyInterface1 {

    default void myMethod() {
        System.out.println("MyInterface1");
    }
}
