package com.devesh.patternsprograms;

public class ReversePascalTriangleOddColumn {
    public static void main(String[] args) {
        int n=4;

        for (int i=4;i>0;i--){
            for (int s=0;s<=n-i;s++){
                System.out.print(" ");
            }
            for (int j=1;j<=2*i-1;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
