package com.devesh.arrays_example;

public class LinearSearchElement {
    public static int isNumber(int[] arr,int n){
        for (int i=0;i< arr.length;i++){
            if (arr[i]==n){
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int[] arr={22,34,27,11,76};
        int number=27;
        System.out.println(isNumber(arr,number)+" position the number is present");
    }
}
