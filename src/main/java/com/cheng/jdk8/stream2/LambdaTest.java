package com.cheng.jdk8.stream2;

/**
 * lambda表达式 与 匿名内部类
 *
 * @author cheng
 *         2018/12/3 19:00
 */
public class LambdaTest {

    private Runnable r1 = () -> System.out.println(this);

    private Runnable r2 = new Runnable() {
        @Override
        public void run() {
            System.out.println(this);
        }
    };

    public static void main(String[] args) {

        LambdaTest lambdaTest = new LambdaTest();

        Thread t1 = new Thread(lambdaTest.r1);
        t1.start();

        System.out.println("----------");

        Thread t2 = new Thread(lambdaTest.r2);
        t2.start();
    }
}
