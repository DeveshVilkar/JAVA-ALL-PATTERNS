package com.devesh.patternsprograms;

public class LeftTriangleinAlphabetReverse {
    public static void main(String[] args) {
        int n=5;
        for (int i=1;i<=n;i++){
            int k=5;
            for (int j=1;j<=i;j++){
                System.out.print((char)(96+k));
                k--;

            }
            System.out.println();
        }

    }
}
