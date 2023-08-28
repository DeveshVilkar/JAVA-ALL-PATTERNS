package com.devesh.patternsprograms;

public class SqaureAlternate10 {
    public static void main(String[] args) {
        int k=1;
        for (int i=1;i<=5;i++){
            for (int j=1;j<=5;j++){
                System.out.print(k%2);
                k++;
            }
            System.out.println();
        }
    }
}
