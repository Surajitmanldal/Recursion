package sorting;

import java.util.Arrays;

public class quickSort {
    public static void main(String[] args) {
        int[] arr={10,5,8,12,15,6,3,9,16};
        quick(arr,0,arr.length-1);
        System.out.println(Arrays.toString(arr));
    }
    static void quick(int[] arr, int low , int high) {
        if (low < high){
            int pivot=partition(arr,low,high);
            quick(arr,low,pivot-1);
            quick(arr,pivot+1,high);
        }
    }
    static int partition(int[] arr,int low , int high){
        int pivot=arr[low];
        int i=low;
        int j=high;

        while (i<j){
            while(i<=high && arr[i]<=pivot){
                i++;
            }
            while (j>=low && arr[j]>pivot){
                j--;
            }
            if(i<j){
                swap(arr,i,j);
            }
        }
        swap(arr,low,j);
        return j;

    }
    static void swap(int[] arr, int start, int end){
        int temp=arr[start];
        arr[start]=arr[end];
        arr[end]=temp;
    }
}
