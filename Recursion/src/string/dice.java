package string;

import java.util.ArrayList;

public class dice {
    public static void main(String[] args) {
        System.out.println(dicePrint(4,"").size());
        System.out.println(dicePrintCount(4,""));
    }

    static ArrayList<String> dicePrint(int target, String comb) {
        if (target == 0){
           ArrayList<String> list=new ArrayList<>();
           list.add(comb);
           return list;
        }
ArrayList<String> list=new ArrayList<>();
        for (int i=1;i<=target; i++){
            list.addAll(dicePrint(target-i,comb+i));
        }
        return list;
    }
     static int dicePrintCount(int target, String comb) {
        if (target == 0){
          return 1;
        }
int count=0;
        for (int i=1;i<=6&& i<=target; i++){// i<=6 because die has 6 face by default , you can take extra argument to for face of  the die ,
            // but 6 is classic
            count+=dicePrintCount(target-i,comb+i);
        }
        return count;
    }
}
