package string;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

public class keypad {
    public static void main(String[] args) {
//        printKey("23","");
        String str="23";
//        System.out.println(printKey(str,""));
//        keypad1("79","");
        System.out.println(keypadret("8",""));
    }
    static String[] keypadMap={"","","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};
    static List<String> printKey(String str, String newStr){
        if(str.isEmpty()){
            ArrayList<String> list=new ArrayList<>();
            list.add(newStr);
            return list;

        }
      ArrayList<String> list=new ArrayList<>();
        String key=keypadMap[str.charAt(0)-'0'];
        for(int i=0;i<key.length();i++){
           List<String> c_list= printKey(str.substring(1),newStr+key.charAt(i));
           list.addAll(c_list);
        }
    return  list;
    }
    static void keypad1(String str, String newStr) {
        if (str.isEmpty()) {
            System.out.println(newStr);
            return;
        }
        int digit = str.charAt(0) - '0';
        if (digit == 1 || digit == 0) {
            keypad1(str.substring(1), newStr);
            return;
        }
        if (digit == 7) {
            int start = (digit - 2) * 3;
            int end = start + 4;
            for (int i = start; i < end; i++) {
                char ch = (char) ('a' + i);
                keypad1(str.substring(1), newStr + ch);
            }
        } else if (digit == 9) {
            int start = ((digit - 2) * 3) + 1;
            int end = start + 4;
            for (int i = start; i < end; i++) {
                char ch = (char) ('a' + i);
                keypad1(str.substring(1), newStr + ch);
            }
        } else {
            int start = (digit - 2) * 3;
            int end = start + 3;
            for (int i = start; i < end; i++) {
                char ch = (char) ('a' + i);
                keypad1(str.substring(1), newStr + ch);
            }
        }
    }
     static ArrayList<String> keypadret(String str, String newStr) {
        if (str.isEmpty()) {
           ArrayList<String> list=new ArrayList<>();
           list.add(newStr);
           return list;
        }
        int digit = str.charAt(0) - '0';
        ArrayList<String> list=new ArrayList<>();
        if (digit == 1 || digit == 0) {
           return keypadret(str.substring(1), newStr);
        }
        int start,end;
        if (digit == 7) {
            start = (digit - 2) * 3;
             end = start + 4;
            for (int i = start; i < end; i++) {
                char ch = (char) ('a' + i);
                list.addAll(keypadret(str.substring(1), newStr + ch));
            }
        } else if (digit == 9) {
             start = ((digit - 2) * 3) + 1;
             end = start + 4;
            for (int i = start; i < end; i++) {
                char ch = (char) ('a' + i);
                list.addAll(keypadret(str.substring(1), newStr + ch));
            }
        } else {
             start = (digit - 2) * 3 + (digit>7?1:0);
             end = start + 3;
            for (int i = start; i < end; i++) {
                char ch = (char) ('a' + i);
                list.addAll(keypadret(str.substring(1), newStr + ch));
            }

        }
        return list;
    }
}
