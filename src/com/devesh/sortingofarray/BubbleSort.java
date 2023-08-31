package com.devesh.sortingofarray;

public class BubbleSort {
    public static int[] bubbleSort(int[] arr){
        for (int i=0;i< arr.length;i++){
            for (int j=0;j< arr.length-1-i;j++){
                if (arr[j]>arr[j+1]){
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
        return arr;
    }
    public static void main(String[] args) {
        int[] arr={7,8,1,4,3,5,6};
        int[] res=bubbleSort(arr);
        for (int k=0;k< res.length;k++){
            System.out.print(res[k]+" ");
        }
    }
}
