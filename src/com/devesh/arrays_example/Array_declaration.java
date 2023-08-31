package com.devesh.arrays_example;

import java.util.Scanner;

public class Array_declaration {
    public static void main(String[] args) {
//        int[] arr=new int[4];
//        arr[0]=42;
//        arr[1]=2;
//        arr[2]=223;
//        arr[3]=421;
//        System.out.println(arr[1]);

//         int[] a={1,2,3,4,5,6};
         Scanner sc=new Scanner(System.in);
         int[] arr=new int[5];
         for (int i=0;i< arr.length;i++){
             arr[i]=sc.nextInt();

         }

        for (int i=0;i< arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
