public class factorial {
    public static void main(String[] args) {
int n=5;
        System.out.println(factorialNum(n));
    }
    static int factorialNum(int n){
        if(n==0) {
            return 1;
        }
        System.out.println(n);
        return n * factorialNum(n-1);
    }
}
