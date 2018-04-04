package com.fp.example;

import org.openqa.selenium.interactions.SourceType;

import java.lang.reflect.Field;
import java.util.List;
import java.util.stream.Stream;

public class example {

    public void myMethod() throws IllegalAccessException {
        Data data = new Data();
        data.setVar1("value set");
        Stream.of(data.getClass().getDeclaredFields())
                .filter(x -> {
                    try {
                        return x.get(data) != null;
                    } catch (IllegalAccessException e) {
                        e.printStackTrace();
                    }
                    return false;
                })
                .map(x -> {
                    System.out.println("value "+x.getName());
                    return x;
                })
                .forEach(x -> System.out.println("for each "+x));





//        for(Field field : data.getClass().getDeclaredFields()){
//            Object value = field.getName();
//
//            System.out.println(value);
//            String val = field.get().
//            System.out.println("this is value "+val);
//        }
    }



















    public static void main(String args[]) throws IllegalAccessException {
        example e = new example();
        e.myMethod();





//        Stream.of("d2", "a2", "b1", "b3", "c")
//                .map(s -> {
//                    System.out.println("map: " + s);
//                    return s.toUpperCase();
//                })
//                .anyMatch(s -> {
//                    System.out.println("anyMatch: " + s);
//                    return s.startsWith("A");
//                });
//
//        Stream.of("d2", "a2", "b1", "b3", "c")
//                .sorted((s1, s2) -> {
//                    System.out.printf("sort: %s; %s\n", s1, s2);
//                    return s1.compareTo(s2);
//                })
//                .filter(s -> {
//                    System.out.println("filter: " + s);
//                    return s.startsWith("a");
//                })
//                .map(s -> {
//                    System.out.println("map: " + s);
//                    return s.toUpperCase();
//                })
//                .forEach(s -> System.out.println("forEach: " + s));
    }
}
