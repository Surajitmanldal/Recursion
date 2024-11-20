public class binary
{

        static boolean find ( int[] arr, int element){
        int start = 0;
        int end = arr.length - 1;
         boolean isAsc = arr[start] < arr[end];
        while (start <= end) {
              int mid = start + (end - start) / 2;
            if (element == arr[mid]) {
                return true;
            }
            if (isAsc) {
                if (element > arr[mid]) {
                    start = mid + 1;
                } else {
                    end = mid - 1;
                }
            } else {
                if (element < arr[mid]) {
                    start = mid + 1;
                } else {
                    end = mid - 1;
                }

            }
        }
        return false;
    }

  public static void main(String[] args){
    int[] arr={22,32,2,4,3};
    System.out.println(find(arr,4));
  }
}

