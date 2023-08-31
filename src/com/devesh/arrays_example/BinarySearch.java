package com.devesh.arrays_example;

public class BinarySearch {
    public static void isPresent(int[] arr,int n){
        int lower=0;
        int upper= arr.length-1;
        while(lower<=upper){
            int middle=(lower+upper)/2;
        if (arr[middle]==n){
            System.out.println("number is present at"+middle);
            break;
        } else if (arr[middle]>n) {
            upper=middle-1;
        } else if (arr[middle]<n) {
            lower=middle+1;

        }else {
            System.out.println("element not found");
        }
    }

    }
    public static void main(String[] args) {
        int[] arr={22,34,27,11,76};
        int number=76;
       isPresent(arr,number);
    }
}
