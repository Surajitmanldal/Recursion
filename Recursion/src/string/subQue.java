package string;

import java.awt.image.AreaAveragingScaleFilter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class subQue {
    public static void main(String[] args) {
        String str="abc";
//        Subsequence(str,"");
        ArrayList<String> list =new ArrayList<>();
//       Subsequence2(str,"",list);
//        System.out.println(list);
        System.out.println(Subsequence3(str,""));
    }
    static void Subsequence(String str,String newStr){
        if(str.isEmpty()){
            System.out.println(newStr);
            return;
        }

        char ch=str.charAt(0);
        Subsequence(str.substring(1),newStr+ch);
        Subsequence(str.substring(1),newStr);
    }

     static void Subsequence2(String str, String newStr, ArrayList<String> list){
        if(str.isEmpty()){
          list.add(newStr);
          return;
        }
char ch=str.charAt(0);
        Subsequence2(str.substring(1),newStr+ch,list);
        Subsequence2(str.substring(1),newStr,list);
    }

    static ArrayList<String> Subsequence3(String str, String newStr){
      if(str.isEmpty()){
          ArrayList<String> subs=new ArrayList<>();
          subs.add(newStr);
          return subs;
      }
        char ch=str.charAt(0);
        ArrayList<String> include=Subsequence3(str.substring(1),newStr+ch);
        ArrayList<String> exclude=Subsequence3(str.substring(1),newStr);

        include.addAll(exclude);
        return include;
    }
}
