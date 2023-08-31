package com.devesh.list;

import java.util.ArrayList;
import java.util.Collections;

public class Arraylist_Ex {
    public static void main(String[] args) {
        ArrayList<Integer> a1=new ArrayList<>();
        a1.add(23);
        a1.add(3);
        a1.add(2);
        a1.add(12);
        a1.add(73);
        a1.add(93);

        System.out.println(a1);

//2nd object
        ArrayList<Integer> a2=new ArrayList<>();
        a2.add(3);
        a2.add(2);
        a2.add(12);
        System.out.println(a2);
//        add all elements of a2 in a1
       a1.addAll(a2);
        System.out.println(a1);
//        checking element present or not
        System.out.println(a1.contains(23));
//        remove element
        a1.remove(4);
        System.out.println(a1);
//        adding element on specified position
       a1.add(2,111);
        System.out.println(a1);
//        getting the element
        int number=a1.get(0);
        System.out.println(number);
        System.out.println(a1);
//        sorting values
        Collections.sort(a1);
        System.out.println(a1);

    }
}
