package com.devesh.arrays_example;

public class LargestNumber {
    public static int isLargest(int[] arr){
        int largest=arr[0];
        for(int i=1;i< arr.length;i++){
            if (largest<arr[i]){
                largest=arr[i];
            }
        }
        return largest;
    }
    public static void main(String[] args) {
        int[] arr={10,2,3,40,23,5};
        System.out.println(isLargest(arr));
    }
}
