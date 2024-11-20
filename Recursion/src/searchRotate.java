public class searchRotate {
    public static void main(String[] args) {
        int[] arr={4,5,6,7,0,1,2,3};
        int target=8;

        System.out.println(rotateSearch(arr,target));
    }
    static int rotateSearch(int[] arr, int target){
        int pivotNum=findPivot(arr,0,arr.length-1);
        if(arr[pivotNum]==target){
            return pivotNum;
        }
        if(arr[0]<target){
            return binary(arr,target,0,pivotNum);
        }
        return binary(arr,target,pivotNum+1,arr.length);
    }
    static int findPivot(int[] arr,int start, int end){
        int mid=start+(end-start)/2;
        if(mid <arr.length-1 && arr[mid]> arr[mid+1]){
            return mid;
        }
        else if(mid > 0 && arr[mid]<arr[mid-1]){
            return mid-1;
        } else if (arr[start]>arr[mid]) {
            return findPivot(arr,start,mid-1);
        }
        else{
            return findPivot(arr,mid+1,end);
        }
    }
    static int binary(int[] arr, int target, int start, int end){
        if(start>=end){
            return -1;
        }
        int mid=start+(end-start)/2;
        if(arr[mid]==target){
            return mid;
        }
        else if(arr[mid]>target){
            return binary(arr,target,start,mid-1);
        }
        return binary(arr,target,mid+1,end);
    }
}
