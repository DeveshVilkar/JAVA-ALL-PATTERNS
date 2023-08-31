package com.devesh.string;

public class ReverseOrderofWord {
    public static void reverseWord(String str){
        String[] s=str.split(" ");
       for (int i=s.length-1;i>=0;i--){
           System.out.print(s[i]+" ");
       }

    }
    public static void main(String[] args) {
        String str="hello world";
        reverseWord(str);
    }
}
