public class reverseNum {
    public static void main(String[] args) {
        int n=1234;
       reverseN(n);
       int reverse=0;
        System.out.println(rev1(n,reverse));
        System.out.println(rev2(n));
        System.out.println(rev3(n));
    }
   static int rev=0;
    static void reverseN(int n){
        if(n==0){
            System.out.println(rev);
            return;
        }
       rev=rev*10+n%10;
        reverseN(n/10);
    }
    static int rev1(int n,int reverse){
        if(n==0){
            return reverse;
        }
        return rev1(n/10,reverse*10+n%10);
    }
    static int rev2(int n){
        if(n==0){
            return 0;
        }
        int digits=(int)Math.log10(n);
        return (n%10) * (int)(Math.pow(10,digits))+rev2(n/10) ;
    }
    static int rev3(int n){
        int digits=(int)Math.log10(n);
        return helper(n,digits);
    }
            static int helper(int n, int digits){
        if(n%10==n){
            return n;
        }
        int rem=n%10;
        return rem * (int)(Math.pow(10,digits))+ helper(n/10,digits-1);
            }
}
