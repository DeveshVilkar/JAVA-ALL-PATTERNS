package com.devesh.patternsprograms;

public class DiamondPatternNo_DecreasetillMid_ThenIncrease {
    public static void main(String[] args) {
        int n=4;
        int count=0;
        int number=0;
        for (int i=1;i<2*n;i++){
            int totalspace=(i<=n)?n-i:i-n;
            for (int s=1;s<=totalspace;s++){
                System.out.print(" ");
            }

            if (i<=n){
                count=2*i-1;
                number=i;
            }else {
                count=count-2;
                number=8-i;
            }
            for (int j=1;j<=count;j++){
                int middle_val=count/2+1;
                if (j<=middle_val){
                    System.out.print(number);
                    number--;
                }else{
                    number++;
                    System.out.print(number+1);
                }

            }
            System.out.println();
        }
    }
}
