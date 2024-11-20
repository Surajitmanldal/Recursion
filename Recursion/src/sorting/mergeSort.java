package sorting;

import java.util.Arrays;

public class mergeSort {
    public static void main(String[] args) {
        int[] arr={8,1,20,7,3};
        System.out.println(Arrays.toString(merge(arr)));
    }
    static int[] merge(int[] arr){
        if(arr.length==1){
            return arr;
        }
        int mid=arr.length/2;
        int[] leftSide= merge(Arrays.copyOfRange(arr,0,mid));
        int[] rightSide=merge(Arrays.copyOfRange(arr,mid,arr.length));
        return mergeThese(leftSide,rightSide);
    }
    static int[] mergeThese(int[] first, int[] second) {
        int[] mix = new int[first.length+second.length];
        int i=0;
        int j=0;
        int count=0;
        while(i<first.length && j<second.length){
            if(first[i]<second[j]){
                mix[count]=first[i++];
            }
            else{
                mix[count]=second[j++];
            }
            count++;
        }

        while (i<first.length){
            mix[count++]=first[i++];
        }
        while (j<second.length) {
            mix[count++] = second[j++];
        }
        return mix;
    }
}
