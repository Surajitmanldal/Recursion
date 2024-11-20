package sorting;

import java.util.ArrayList;
import java.util.Arrays;

public class mergeSort2 {
    public static void main(String[] args) {
        int[] arr = {8, 1, 9, 7, 3};
        merge(arr, 0, arr.length - 1);
        System.out.println(Arrays.toString(arr));
    }

   static void merge(int[] arr, int start, int end){
        if (start==end){
            return;
        }

        int mid=(start+end)/2;
       //first half
        merge(arr,start,mid);
        //second half
        merge(arr,mid+1,end);

        //for merge this two arrays
       mergeArrays(arr,start,mid,end);
   }
   static void mergeArrays(int[] arr, int start, int mid, int end){
       ArrayList<Integer> list =new ArrayList<>();// for using temp array , that holding current value ,
        int right=mid+1;
        int left=start;

        while (left<=mid && right<=end){
            if(arr[left]<=arr[right]){
               list.add(arr[left]);
               left++;
            }
            else{
                list.add(arr[right]);
                right++;
            }
        }
        //if any remaining element
       while (left<=mid){
           list.add(arr[left]);
           left++;
       }
        while (right<=end){
            list.add(arr[right]);
            right++;
        }

        for(int i=0;i<list.size();i++){
            arr[start+i]=list.get(i);
        }
   }
}
