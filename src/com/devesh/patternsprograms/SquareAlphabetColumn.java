package com.devesh.patternsprograms;

public class SquareAlphabetColumn {
    public static void main(String[] args) {

        for (int i=1;i<=4;i++){
            int k=4;
            for (int j=1;j<=4;j++){
                System.out.print((char)(64+k));
                k--;
            }
            System.out.println();
        }
    }

}
