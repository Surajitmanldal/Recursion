public class palindrome {
    public static void main(String[] args) {
        int n=147;
        System.out.println(palindromeNum(n));
        System.out.println(palindrome2(n,0,n));
    }
    static boolean palindrome2(int n , int reverse, int original){
        if(n==0){
            return reverse==original;
        }
        return palindrome2(n/10,reverse*10+(n%10),original);
    }
    static boolean palindromeNum(int n){
        return n==rev(n);
    }
static int rev(int n){
        if(n%10==n){
            return n;
        }
        int digits=(int) Math.log10(n);
        return  (n %10) *(int)(Math.pow(10,digits))+rev(n/10);
}


}
