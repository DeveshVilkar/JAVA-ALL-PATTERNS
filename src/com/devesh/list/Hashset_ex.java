package com.devesh.list;

import java.util.Iterator;
import java.util.HashSet;

public class Hashset_ex {
    public static void main(String[] args) {
        HashSet h=new HashSet<>();
        h.add("bk1");
        h.add("bk1");
        h.add("book1");
        h.add("bedfk1");
        h.add("bfghk1");
        System.out.println(h);
        h.remove("book1");
        System.out.println(h);

//        iterator
        Iterator i=h.iterator();
//        next()
        System.out.println(i.next());
        System.out.println(i.next());
        System.out.println(i.next());
//        hasnext()
        while(i.hasNext()){
            System.out.println(i.next());
        }
    }
}
