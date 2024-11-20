package string;

public class skipChar {
    public static void main(String[] args) {
        String str="baccand";
        charSkip(str,"");
        String ans=skip(str);
        System.out.println(ans);
    }
    static void charSkip(String str,String newStr) {
        if(str.isEmpty()){
            System.out.println(newStr);
            return;
        }

         char ch=str.charAt(0);
        if(ch!='a'){
            charSkip(str.substring(1),newStr+ch);
        }else {
            charSkip(str.substring(1),newStr);
        }
    }
    static String skip(String str){
        if(str.isEmpty()){
            return str;
        }

        char ch=str.charAt(0);
            if(ch!='a'){
                return ch+skip(str.substring(1));
            }
            else{
                return skip(str.substring(1));
            }
        }
    }

