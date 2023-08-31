package com.devesh.string;

import java.util.Arrays;

public class Anagram {
    public static boolean isAnagram(String str1,String str2){
        str1=str1.replaceAll("","").toLowerCase();
        str2=str2.replaceAll("","").toLowerCase();
        if (str1.length()!=str2.length()){
            return false;
        }
        char[] chararray1=str1.toCharArray();
        char[] chararray2=str2.toCharArray();
        Arrays.sort(chararray1);
        Arrays.sort(chararray2);
        return Arrays.equals(chararray1,chararray2);
    }
    public static void main(String[] args) {
        String str1="SIlent";
        String str2="LiTsen";
        System.out.println(isAnagram(str1,str2));
    }
}
