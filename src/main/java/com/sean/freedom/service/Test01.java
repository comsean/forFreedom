package com.sean.freedom.service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class Test01 {
    public static void main(String[] args) {
        foreach(
                Arrays.asList(1, 3, 5), (Integer i) -> System.out.println(i)
        );
        System.out.println("##############################");
        List<String> stringList =new ArrayList<>();
        stringList.add("like");
        stringList.add("");
        stringList.add("name");
        for (String s : stringList) {
            System.out.println("s="+s);
        }
//        filter(stringList,(String::isEmpty));
        List<String> newList =  filter(stringList,(String s) -> !s.isEmpty());
        for (String s : newList) {
            System.out.println("new="+s );
        }

    }

    public static <T> void foreach(List<T> list, Consumer<T> consumer) {
        for (T t : list) {
            consumer.accept(t);
        }
    }

    public static List<String> filter(List<String> list, Predicate<String> predicate) {
        List<String> result = new ArrayList<>();
        for (String s : list) {
            if (predicate.test(s)) {
                result.add(s);
            }
        }
        return result;
    }
}
