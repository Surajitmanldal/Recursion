package string;

import java.util.Arrays;

public class permutationArray {
    public static void main(String[] args) {
       int[] arr={1,2,3};
       permute(arr,0,arr.length-1);
    }
    static  void permute(int[] arr, int start, int end) {
    if (start == end) {
        // Print the current permutation
        System.out.println((Arrays.toString(arr)));
        return;
    }

    for (int i = start; i <= end; i++) {
        // Swap to place a new element at the 'start' index
        swap(arr, start, i);

        // Recur to generate permutations for the remaining elements
        permute(arr, start + 1, end);

        // Backtrack to restore the original array
        swap(arr, start, i);
    }
}
static  void swap(int[] arr, int start,int end){
        int temp=arr[start];
        arr[start]=arr[end];
        arr[end]=temp;
}
}
