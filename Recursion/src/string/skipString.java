package string;

public class skipString {
    public static void main(String[] args) {
        String str="djapplevau";
        String ans=skipApple(str);
//        System.out.println(ans);
        System.out.println(skipAppNotApple("sjsbappbcja"));
    }
    static String skipApple(String str){
        if(str.isEmpty()){
            return " ";
        }

        if(str.startsWith("apple")){
            return skipApple(str.substring(5));
        }
        else{
            return str.charAt(0)+skipApple(str.substring(1));
        }
    }
    static String skipAppNotApple(String str){
        if(str.isEmpty()){
            return " ";
        }

        if(str.startsWith("app") && !str.startsWith("apple")){
            return skipAppNotApple(str.substring(3));
        }
        else{
            return str.charAt(0)+skipAppNotApple(str.substring(1));
        }
    }
}
