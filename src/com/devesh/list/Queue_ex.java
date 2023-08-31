package com.devesh.list;

import java.util.LinkedList;
import java.util.Queue;

public class Queue_ex {
    public static void main(String[] args) {
        Queue q=new LinkedList();
        q.add("book1");
        q.add("book1");
        q.add("book1");
        q.add("book4");
        q.add("book2");
        System.out.println(q);
        System.out.println(q.poll());
        System.out.println(q);
    }
}
