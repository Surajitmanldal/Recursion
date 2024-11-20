public class linearSearch {
    public static void main(String[] args) {
        int[] arr={2,1,5,7,9,10};
        int target=7;
        System.out.println(linear(arr,0,target));
        System.out.println(search(arr,0,target));
    }
    static int linear(int[] arr ,int i,int target){
        if(i==arr.length){
            return -1;
        } else if (arr[i]==target) {
            return i;
        }
        return linear(arr,i+1,target);
    }
    static boolean search(int[] arr,int idx,int target){
        if(idx==arr.length){
            return false;
        }
        return  arr[idx] == target || search(arr,idx+1,target);
    }
}
