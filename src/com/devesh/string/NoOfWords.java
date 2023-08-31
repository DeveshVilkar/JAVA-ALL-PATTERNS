package com.devesh.string;

public class NoOfWords {
    public static int noOfWords(String str){
        int count=1;
        for (int i=0;i<str.length();i++){
            if (str.charAt(i)==' ' && str.charAt(i+1)!=' '){
                count++;
            }
        }
        return count;
    }
    public static void main(String[] args) {
        String str="hello world";
        System.out.println( noOfWords(str));;
    }
}
