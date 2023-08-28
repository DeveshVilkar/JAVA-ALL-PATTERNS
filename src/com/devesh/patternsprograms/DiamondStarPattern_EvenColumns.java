package com.devesh.patternsprograms;

public class DiamondStarPattern_EvenColumns {
    public static void main(String[] args) {
        int n=5;
        for (int i=1;i<2*n;i++){
            int totalspace=(i<=n)?n-i:i-n;
            int totalcol=n-totalspace;
            for (int s=1;s<=totalspace;s++){
                System.out.print(" ");
            }
            for (int j=1;j<=totalcol;j++){
                System.out.print("* ");
            }
            System.out.println();
        }

    }
}
