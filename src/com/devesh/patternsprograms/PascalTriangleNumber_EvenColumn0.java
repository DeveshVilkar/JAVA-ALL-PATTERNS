package com.devesh.patternsprograms;

public class PascalTriangleNumber_EvenColumn0 {
    public static void main(String[] args) {
        int n = 5;
        int num=1;
        for (int i = 1; i <= n; i++) {
            for (int s = 1; s <= n - i; s++) {
                System.out.print(" ");
            }
            int k = i - 1;
            for (int j = 1; j <= i + k; j++) {
                System.out.print(num % 2);
                num++;
            }
            System.out.println();
        }
    }
}
