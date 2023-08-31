package com.devesh.string;

public class Palindrome_Withoutcompare {
    public static boolean isPalindrome(String str){
        int low=0;
        int high=str.length()-1;
        while(low<=high){
            if (str.charAt(low)!=str.charAt(high)){
                return false;
            }else{
                low++;
                high--;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        String str="madam";
        System.out.println(isPalindrome(str));
    }

}
