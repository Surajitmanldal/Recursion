public class rotateSearch {
    public static void main(String[] args) {
        int[] arr = {4,4, 5, 5, 6, 7, 7, 0, 1, 1, 2, 3, 3};
        int[] arr1={2, 2, 2,2,3,0, 2, 2};
//Recursively
        System.out.println(search(arr1, 3, 0, arr1.length - 1));
        //iterate
        System.out.println(search2(arr,0));
    }

    static int search(int[] arr, int target, int start, int end) {
        if (start > end) {
            return -1;
        }

        int mid = start + (end - start) / 2;
        if (arr[mid] == target) {
            return mid;
        }
         // Check if we have duplicates at the edges
//    if (arr[start] == arr[mid] && arr[mid] == arr[end]) {
//        // Move the pointers closer to skip the duplicates
//        start++;
//        end--;
//        return search(arr, target, start, end);
//    }
        else if (arr[start] <= arr[mid]) {
            if (target >= arr[start] && target <= arr[mid]) {
                return search(arr, target, start, mid - 1);
            } else {
                return search(arr, target, mid + 1, end);
            }
            //for right half
        } else {
            if (target >= arr[mid] && target <= arr[end]) {
                return search(arr, target, mid + 1, end);
            }
            return search(arr, target, start, mid - 1);
        }
    }
    static int search2(int[] arr, int target){
        int start=0;
        int end=arr.length-1;
        while(start<=end){
            int mid=start+(end-start)/2;
            if(arr[mid]==target){
                return mid;
            }
            else if(arr[start]<=arr[mid]){
                if(arr[start]<=target && target<=arr[mid]){
                    end=mid-1;
                }
                else{
                    start=mid+1;
                }
            }
            else{
                if(target>=arr[mid] && target<=arr[end]){
                    start=mid+1;
                }
                end=mid-1;
            }

        }
        return -1;
    }
}
