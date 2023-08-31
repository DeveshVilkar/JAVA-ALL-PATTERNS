package com.devesh.list;
import java.util.Stack;

public class Stack_ex {
    public static void main(String[] args) {
        Stack s=new Stack();
        s.push("book1");
        s.push("book2");
        s.push("book3");
        s.push("book6");
        s.push("book3");
        System.out.println(s);
        System.out.println(s.peek());
        s.pop();
        s.pop();
        System.out.println(s);


    }
}
