import java.util.Arrays;

public class mergeSort {
    public static void main(String[] args) {
int[] arr1={3,5,9};
int[] arr2={4,6,8};
        System.out.println(Arrays.toString(merge(arr1,arr2)));
    }
    static int[]  merge(int[] arr1, int[] arr2){
        int[] newArr=new int[arr1.length+arr2.length];
        int i=0;
        int j=0;
        int count=0;
        while (i<arr1.length && j<arr2.length){
            if(arr1[i]<arr2[j]){
                newArr[count++]=arr1[i++];
            }
            else {
                newArr[count++]=arr2[j++];
            }
        }
        while (i<arr1.length){
            newArr[count++]=arr1[i++];
        }

        while (j<arr2.length){
            newArr[count++]=arr2[j++];
        }

        return newArr;
    }
}
