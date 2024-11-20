import java.util.Arrays;

public class selectionSort {
    public static void main(String[] args) {
        int[] arr={3,2,1,6,5};
        //this function looking for smallest element and put it into first
//        selection(arr,0,1,0);
//        System.out.println(Arrays.toString(arr));
                //this function looking for largest element and put it into last

        selection1(arr,arr.length-1,0,0);
        System.out.println(Arrays.toString(arr));

    }
    static void selection(int[] arr, int i, int j,int smallest){
        if(i==arr.length){
            return;
        }
//        smallest=i;
        if(j<arr.length){
            if(arr[smallest]>arr[j]){
                  smallest=j;
            }
                selection(arr,i,j+1,smallest);
        }
        else{
            int temp=arr[smallest];
            arr[smallest]=arr[i];
            arr[i]=temp;
            selection(arr,i+1,i+2,i+1);
        }
    }

    static void selection1(int[] arr,int i, int j , int largest){
       if(i==0){
           return;
       }

       if(j<=i){
           if(arr[largest]<arr[j]){
               largest=j;
           }
           selection1(arr,i,j+1,largest);
       }
       else{
           int temp=arr[largest];
           arr[largest]=arr[i];
           arr[i]=temp;
           selection1(arr,i-1,0,0);
       }
    }


}
