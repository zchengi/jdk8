package com.cheng.jdk8;

import java.util.Arrays;
import java.util.List;

/**
 * @author cheng
 *         2018/11/16 14:46
 */
public class StringComparator {
    public static void main(String[] args) {

        List<String> names = Arrays.asList("zhang", "wang", "li", "zhou");

        /*Collections.sort(names, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o2.compareTo(o1);
            }
        });*/

        /*Collections.sort(names,(o1,o2)->{
            return o2.compareTo(o1);
        });*/

//        Collections.sort(names, (o1, o2) -> o2.compareTo(o1));

//        Collections.sort(names, Comparator.reverseOrder());


        System.out.println(names);
    }
}
