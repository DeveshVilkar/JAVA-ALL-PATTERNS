package com.devesh.patternsprograms;

public class PascalTriangleNumber_Star_Multiplication {
    public static void main(String[] args) {
        int n=5;
        for (int i=1;i<=n;i++){
            for (int s=1;s<=n-i;s++){
                System.out.print(" ");
            }
            int k=i-1;
            int num=1;
            int pro=1;
            for (int j=1;j<=i+k;j++){
                if (j%2==0){
                    System.out.print("*");
                }else{
                    pro=pro*num;
                    System.out.print(num);
                    num++;
                }
            }
            for (int s=1;s<=n-i;s++){
                System.out.print(" ");
            }
            System.out.print("= "+pro);
            System.out.println();
        }
    }
}
