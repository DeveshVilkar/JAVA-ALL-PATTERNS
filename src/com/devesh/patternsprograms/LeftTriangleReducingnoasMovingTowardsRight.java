package com.devesh.patternsprograms;

public class LeftTriangleReducingnoasMovingTowardsRight {
    public static void main(String[] args) {
        int n=5;
        for (int i=1;i<=n;i++){
            int k=n;
            for (int j=1;j<=i;j++){
                System.out.print(k);
                k--;
            }
            System.out.println();
        }
    }
}
