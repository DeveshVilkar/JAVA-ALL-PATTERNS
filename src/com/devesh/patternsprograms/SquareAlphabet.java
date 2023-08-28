package com.devesh.patternsprograms;

public class SquareAlphabet {
    public static void main(String[] args) {
        for (int i=1;i<=4;i++){
            for (int j=1;j<=4;j++){
                System.out.print((char)(64+i));
            }
            System.out.println();
        }
    }
}
