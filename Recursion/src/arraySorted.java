public class arraySorted {
    public static void main(String[] args) {
        int[] arr={2,9,102,11,16,96};
        System.out.println(isSorted(arr,0));
        System.out.println(isSort(arr,0));
    }
    //this is more  optimized because when any unsorted element find , it will be gives false , no need to iterate whole array.
    static boolean isSorted(int[] arr,int i){
        if(i==arr.length-1){
            return true;
        }
        else if (arr[i]>arr[i+1]){
            return false;
        }
        return isSorted(arr,i+1);
    }
    static boolean isSort(int[] arr, int i){
        if(i==arr.length-1){
            return true;
        }
        return arr[i] < arr[i+1] && isSort(arr,i+1);
    }
}
