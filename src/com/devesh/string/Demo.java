package com.devesh.string;

public class Demo {
    public static void main(String[] args) {
        String s="hello";
        String s1="hello";
        System.out.println(s==s1);
        String s3=new String("helloe");
        String s4=new String("helloe");
        System.out.println(s3==s4);
//        total 5 objects 2 of s3 , 2 of s4,1 of s and s1

    }
}
