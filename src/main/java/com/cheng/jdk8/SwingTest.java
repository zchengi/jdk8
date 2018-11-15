package com.cheng.jdk8;

import javax.swing.*;

/**
 * Lambda 表达式初识
 *
 * @author cheng
 *         2018/11/15 16:53
 */
public class SwingTest {
    public static void main(String[] args) {
        JFrame jFrame = new JFrame("My JFrame");
        JButton jButton = new JButton("My JButton");

        // 类型推断，不需要定义 event 的类型
        jButton.addActionListener(event -> {
            System.out.println("Button Pressed");
            System.out.println("Hello World");
        });

        jFrame.add(jButton);
        jFrame.pack();
        jFrame.setVisible(true);
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
