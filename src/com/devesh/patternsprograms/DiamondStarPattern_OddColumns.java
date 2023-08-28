package com.devesh.patternsprograms;

public class DiamondStarPattern_OddColumns {
    public static void main(String[] args) {
        int n=4;
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
            for (int j=1;j<=count;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
