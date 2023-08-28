package com.devesh.patternsprograms;

public class LeftTriangleReverseNumberHighestnoatTop {
    public static void main(String[] args) {
        int n=5;
        for (int i=0;i<n;i++){
            int k=n-i;
            for (int j=0;j<=i;j++){
                System.out.print(k);
                k++;
            }
            System.out.println();
        }
    }
}
