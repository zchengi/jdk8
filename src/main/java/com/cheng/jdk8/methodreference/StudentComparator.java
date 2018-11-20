package com.cheng.jdk8.methodreference;

/**
 * @author cheng
 *         2018/11/20 12:30
 */
public class StudentComparator {

    public int compareStudentByScore(Student student1, Student student2) {
        return student1.getScore() - student2.getScore();
    }

    public int compareStudentByName(Student student1, Student student2) {
        return student1.getName().compareToIgnoreCase(student2.getName());
    }
}
