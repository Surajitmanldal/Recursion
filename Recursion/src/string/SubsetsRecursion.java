package string;

import java.util.ArrayList;
import java.util.List;

public class SubsetsRecursion {
    public static void main(String[] args) {
          int[] arr={1,2,3};
           List<List<Integer>> ans=subsets(arr);
           for (List<Integer> subs: ans){
               System.out.println(subs);
           }

    }
    static List<List<Integer>> subsets(int[] nums){
       List<List<Integer>> result=new ArrayList<>();
       generateSubsets(0,nums,new ArrayList<>(),result);
       return result;
    }
    static void generateSubsets(int idx,int[] arr,ArrayList<Integer> current,List<List<Integer>> result){
        if(idx==arr.length){
            result.add(new ArrayList<>(current));
            return;
        }

        //exclude
        generateSubsets(idx+1,arr,current,result);

        //include
        current.add(arr[idx]);
        generateSubsets(idx+1,arr,current,result);

        //
        current.removeLast();
    }

}
