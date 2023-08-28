package com.devesh.patternsprograms;

import java.util.Scanner;

public class DiamondPatternNo_IncreasealongCol_TillMid_AndDcrease {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number");
        int n=sc.nextInt();
        int count=0;

        for (int i=1;i<2*n;i++){
            int totalspace=(i<=n)?n-i:i-n;
            for (int s=1;s<=totalspace;s++){
                System.out.print(" ");
            }
            if (i<=n){
                count=2*i-1;
            }else{
                count=count-2;
            }
            int number=1;
            for (int j=1;j<=count;j++){
                if (j<=count/2+1){
                    System.out.print(number);
                    number++;
                }else {
                    number--;
                    System.out.print(number-1);
                }
            }
            System.out.println();
        }
    }
}
