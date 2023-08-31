package com.devesh.string;

public class Palindrome {
    public static boolean isPalindrome(String str){
        char[] ch=str.toCharArray();
        int size=ch.length;
        String result="";
        for (int i=size-1;i>=0;i--){
            result=result+ch[i];
        }
        if (result.equalsIgnoreCase(str)){
            return true;
        }
        return false;
    }
    public static void main(String[] args) {
        String str="madaM";
        System.out.println(isPalindrome(str));
    }
}
