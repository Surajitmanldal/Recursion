public class sumOfDigits {
    public static void main(String[] args) {
        int n=264;
        System.out.println(sumOfDigit(n));
        System.out.println(mulOfDigit(n));
    }
    static int sumOfDigit(int n) {
        if(n==0){
            return 0;
        }
     return  sumOfDigit(n/10)+ n%10;
    }
     static int mulOfDigit(int n) {
        if(n%10==n){
            return n;
        }
     return   (n%10) * mulOfDigit(n/10) ;// Since multiplication (*) has a higher precedence than modulo (%)
    }
}
