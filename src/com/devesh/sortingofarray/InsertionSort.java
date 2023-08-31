package com.devesh.sortingofarray;

public class InsertionSort {
    public static void main(String[] args) {
        int[] arr={7,8,1,4,3,5,6};
        int[] res=insertionSort(arr);
        for (int k=0;k< res.length;k++){
            System.out.print(res[k]+" ");
        }
    }
    public static int[] insertionSort(int[] arr){
        for (int i=1;i<arr.length;i++){
            int current =arr[i];
            int j=i-1;
            while(j>=0 && current<arr[j]){
                arr[j+1]=arr[j];
                j--;
            }
            arr[j+1]=current;
        }
        return arr;
    }
    }

