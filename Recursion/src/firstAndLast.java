import java.util.ArrayList;
import java.util.List;

public class firstAndLast {
     static int sum(int a,int b){
        b=7;
        int ans=a+b;
        return ans;

    }
    public static void main(String[] args) {
//        int a=3;
//        int b=9;
//        int ans=sum(a,b);
//        System.out.println(ans);
//        System.out.println(b);


        int[] arr = {1, 2, 3,4,3};
        int target = 3;
        ArrayList<Integer> list =new ArrayList<>();
       ArrayList<Integer> ans= findAlIndex2(arr,target,0,list);
//        System.out.println(ans);
//        System.out.println(list);
        System.out.println(findAlIndex(arr,target,0));

    }
    static ArrayList<Integer> findAlIndex2(int[] arr,int target,int idx,ArrayList<Integer> list){
        if(idx==arr.length){
//            System.out.println(list);
            return list;
        }
        else if(arr[idx]==target){
            list.add(idx);
        }
        return  findAlIndex2(arr,target,idx+1,list);
    }

    static int first=-1;
    static int last=-1;
    static void firstOccur(int[] arr, int target, int idx){
        if(idx==arr.length){
            System.out.println(first);
            System.out.println(last);
            return;
        }
        if(arr[idx]==target){
            if(first==-1){
                first=idx;
            }
            last=idx;
        }
        firstOccur(arr,target,idx+1);
    }
//    static  ArrayList<Integer> list=new ArrayList<>();
    // Now i will Create list inside the function , and let's see how we can do it , without passing extra list inside the arguments

    static ArrayList<Integer> findAlIndex(int[] arr,int target,int idx){
        ArrayList<Integer> list =new ArrayList<>();
   if(idx==arr.length){
       return list;
   }
        if(arr[idx]==target){
            list.add(idx);
        }
       ArrayList<Integer> ans=findAlIndex(arr,target,idx+1);
        list.addAll(ans);
        return list;
    }


}
