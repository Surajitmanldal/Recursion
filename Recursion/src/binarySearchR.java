public class binarySearchR {
    public static void main(String[] args) {
        int[] arr={2,3,5,6,8,10};
        int target=6;
        System.out.println(search(arr,target,0,arr.length-1));
    }
    static  int search(int[] arr, int target,int start,int end){
        if(start>end){
            return -1;
        }
        int mid=start+(end-start)/2;
        if(arr[mid]==target){
            return mid;
        }
        else if(arr[mid]>target){
            return search(arr,target,start,mid-1);
        }
        else{
            return search(arr,target,mid+1,end);
        }
    }
}
