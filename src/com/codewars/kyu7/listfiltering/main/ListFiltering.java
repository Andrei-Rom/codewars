package com.codewars.kyu7.listfiltering.main;

import java.util.ArrayList;
import java.util.List;

public class ListFiltering {

    public static void main(String[] args) {
        List<Object> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add("a");
        list.add("b");
        list.add(0);
        list.add(15);


        List<Object> test = filterList(list);
                test.forEach(System.out::println);


    }
    public static List<Object> filterList(List<Object> list) {
        List<Object> result = new ArrayList<>();
        for (Object element: list
        ) {
            if (element.getClass().getSimpleName().equals("Integer")){
                result.add(element);
            }
        }
        return result;
        //return (List)list.stream().filter(e -> ! (e instanceof String)).collect(Collectors.toList());
    }



}

