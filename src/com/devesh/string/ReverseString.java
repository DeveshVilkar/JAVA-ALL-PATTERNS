package com.devesh.string;

public class ReverseString {
    public static void main(String[] args) {
        String str="hello";
        char[] ch=str.toCharArray();
        int size= ch.length;
        String reversestring="";
        for (int i= size-1;i>=0;i--){
            reversestring=reversestring+ch[i];
        }
        System.out.println(reversestring);

    }
}
