package com.devesh.patternsprograms;

public class DiamondPatternNo_3 {
    public static void main(String[] args) {
        int n=5;
        int count=0;
        int number=0;
        for (int i=1;i<2*n;i++){
            int totalspace=(i<=n)?n-i:i-n;
            for (int s=1;s<=totalspace;s++){
                System.out.print(" ");
            }
            if (i<=n){
                count=2*i-1;
                number=n-i+1;
            }else{
                count=count-2;
                number=i-n+1;
            }
            for (int j=1;j<=count;j++){
                int middleval=count/2+1;
                if (j<=middleval){
                    System.out.print(number);
                    number++;
                }else{
                    number--;
                    System.out.print(number-1);
                }
            }
            System.out.println();
        }
    }
}
