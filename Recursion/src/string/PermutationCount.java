package string;

public class PermutationCount {
    public static void main(String[] args) {
        System.out.println(countPermutation("abc",""));
    }
    static int countPermutation(String str, String permutation){
        if (str.isEmpty()){
            return 1;
        }
        int count=0;
        char ch=str.charAt(0);
        for (int i=0;i<=permutation.length();i++){
            String first=permutation.substring(0,i);
            String second=permutation.substring(i);
            count= count + countPermutation(str.substring(1),first+ch+second);
        }
        return count;
    }
}
