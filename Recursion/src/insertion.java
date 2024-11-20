import java.util.Arrays;

public class insertion {
    public static void main(String[] args) {
      int[] arr={3,2,1,6,5};
//      insertionSort(arr);
      insertionRecursion(arr,0,0,0);
        System.out.println(Arrays.toString(arr));
    }
static void insertionSort(int[] arr){
        for(int i=1;i<arr.length;i++){
            int correctPos=arr[i];
            int sortedPos=i-1;
            while(sortedPos>=0 && correctPos<arr[sortedPos]){
                arr[sortedPos+1]=arr[sortedPos];
                sortedPos--;
            }
            arr[sortedPos+1]=correctPos;
        }
}

    // not Implemented
static void insertionRecursion(int[] arr, int i,int sort,int correct){
        if (i==arr.length){
            return;
        }

        correct=arr[i];
        sort=i-1;
        if(sort>=0 && correct<arr[sort]){
            arr[sort+1]=arr[sort];
            sort--;
            insertionRecursion(arr,i,sort,correct);
        }
        else{
            arr[sort+1]=correct;
            insertionRecursion(arr,i+1,sort,correct);
        }
}
}
