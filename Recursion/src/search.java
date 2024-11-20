import java.util.Arrays;

class search{

    public static void main(String[] args) {
        int[] arr={22,32,2,4,3};
       int target=4;
        System.out.println(search(arr,target));
    }
    static boolean search(int[] arr,int target){
        int start=0;
        int end=arr.length-1;
       boolean isAsc=arr[start]<arr[end];
       while (start<=end){
           int mid=start+ (end-start)/2;
           if (arr[mid]==target){
               return true;
           }
           //isAsc;
           if (isAsc){
               if (target>arr[mid])
                      start=mid+1;
               else
                   end=mid-1;

           }
           //isDesc
           else {
               if (target>arr[mid]){
                   end=mid-1;
               }
               else {
                   start=mid+1;
               }
           }
       }
       return false;
    }
}