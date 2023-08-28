package com.devesh.patternsprograms;

public class HollowDiamond {
    public static void main(String[] args) {
        int  n=4;
        for (int i=1;i<2*n;i++){
            for (int j=1;j<2*n;j++){
                if ((i+j)==5 || (j-i)==3 ||(i-j)==3 ||(i+j)==11){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
