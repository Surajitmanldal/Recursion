package recursionQuestion;

public class findMinAndMax {
    public static void main(String[] args) {
        int[] arr={4,1,-5,34,21,-1,0};
        System.out.println(findMinimum(arr,arr.length));
        System.out.println(findMaximum(arr,arr.length));
    }
    static int findMinimum(int[] arr, int n){
       if(n==1){
           return arr[0];
       }

       return Math.min(arr[n - 1], findMinimum(arr, n - 1));
    }
    static int findMaximum(int[] arr, int n){
        if(n==1){
            return arr[0];
        }
        return Math.max(arr[n-1],findMaximum(arr,n-1));
    }
}
