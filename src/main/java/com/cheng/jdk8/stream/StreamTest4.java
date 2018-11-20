package com.cheng.jdk8.stream;

import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * stream深度解析与源码实践
 *
 * @author cheng
 *         2018/11/20 14:26
 */
public class StreamTest4 {
    public static void main(String[] args) {

        Stream<String> stream = Stream.of("hello", "world", "cheng");

//        String[] strings = stream.toArray(length -> new String[length]);
//        String[] strings = stream.toArray(String[]::new);

//        Arrays.asList(strings).forEach(System.out::println);


//        List<String> list = stream.collect(Collectors.toList());

//        List<String> list = stream.collect(() -> new ArrayList<>(),
//                (theList, item) -> theList.add(item),
//                (theList1, theList2) -> theList1.addAll(theList2));

//        LinkedList<String> list = stream.collect(LinkedList::new, LinkedList::add,LinkedList::addAll);


//        List<String> list = stream.collect(Collectors.toCollection(ArrayList::new));

//        list.forEach(System.out::println);



//        Set<String> set = stream.collect(Collectors.toCollection(TreeSet::new));
//        System.out.println(set.getClass());
//        set.forEach(System.out::println);



        String str = stream.collect(Collectors.joining());
        System.out.println(str);
    }
}
