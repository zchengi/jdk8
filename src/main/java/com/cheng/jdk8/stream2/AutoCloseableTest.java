package com.cheng.jdk8.stream2;

/**
 * AutoCloseable
 *
 * @author cheng
 *         2018/11/24 12:56
 */
public class AutoCloseableTest implements AutoCloseable {

    public void doSomething() {
        System.out.println("do Something invoked");
    }

    @Override
    public void close() {
        System.out.println("close invoked");
    }

    public static void main(String[] args) {

        try (AutoCloseableTest autoCloseable = new AutoCloseableTest()) {
            autoCloseable.doSomething();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
