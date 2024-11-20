package sorting;

import java.util.Arrays;

public class quickSort2 {
    public static void main(String[] args) {
        int[] arr={10,5,5,8,1,2};
        quickSort(arr,0,arr.length-1);
        System.out.println(Arrays.toString(arr));

    }
    static void quickSort(int[] arr, int low , int high){
        if(low>=high){
            return;
        }

        int start=low;
        int end=high;
        int mid=start+(end-start)/2;
        int pivot=arr[mid];
        //this is for partition
       while (start<=end){

           while (arr[start]<pivot){
               start++;
           }
           while (arr[end]>pivot){
               end--;
           }

           if(start<=end){
               int temp=arr[start];
               arr[start]=arr[end];
               arr[end]=temp;
               start++;
               end--;
           }
       }
        quickSort(arr,low,end);
       quickSort(arr,start,high);
    }

}
