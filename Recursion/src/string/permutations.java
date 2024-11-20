package string;

import java.util.ArrayList;

public class permutations {
    public static void main(String[] args) {
//      printPermutations("abc","");
      ArrayList<String> result=printPermutations1("abc","");
        System.out.println(result);
    }
    static void printPermutations(String str,String permutation) {
        if (str.isEmpty()) {
            System.out.println(permutation);
            return;
        }

        for (int i = 0; i <str.length();i++){
            char ch=str.charAt(i);
            String newStr=str.substring(0,i) + str.substring(i+1);
            printPermutations(newStr,permutation+ch);
        }
    }


    static ArrayList<String> printPermutations1(String str, String permutation){
        if (str.isEmpty()){
           ArrayList<String> list=new ArrayList<>();
           list.add(permutation);
           return list;
        }
        ArrayList<String> ans=new ArrayList<>();
        char ch=str.charAt(0);
        for (int i=0;i<=permutation.length();i++){
            String first=permutation.substring(0,i);
            String last=permutation.substring(i);
          ArrayList<String> perm=printPermutations1(str.substring(1),first+ch+last);
          ans.addAll(perm);
        }
       return ans;
    }
}
