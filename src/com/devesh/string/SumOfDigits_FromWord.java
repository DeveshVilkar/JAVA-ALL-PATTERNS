package com.devesh.string;

public class SumOfDigits_FromWord {
    public static int sum(String str){
        String num="";
        for (int i=0;i<str.length();i++){
            if (str.charAt(i)<='0' && str.charAt(i)<='9'){
                num=num+str.charAt(i);
            }
        }
        int n=Integer.parseInt(num);
        int sum=0;
        while(n!=0){
            int k=n%10;
            sum=sum+k;
            n=n/10;
        }
       return sum;
    }
    public static void main(String[] args) {
        String str="a1b2c3d4";
        sum(str);
    }
}
