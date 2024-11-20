class recurion{
    public static void main(String[] args) {
        int n=7;
//        System.out.println(fibonacchiNum(n));

        int a=0,b=1;
        //0,1,1,2,3,5,8,
        System.out.println(a);
//        System.out.println(b);
        fibo(n,a,b);
        System.out.println(fibonacchiNum(n));
        for (int i=0;i<n;i++){
            int newFibo=a+b;
//            System.out.println(newFibo);
            a=b;
            b=newFibo;


        }
    }
    static void fibo(int n,int a,int b){
        if (n==0){
            return;
        }
        int newFibo=a+b;
        System.out.println(newFibo);
        a=b;
        b=newFibo;
        fibo(n-1,a,b);
    }
    static int fibonacchiNum(int n){
        if (n<=1){
            return n;
        }
   return fibonacchiNum(n-1) + fibonacchiNum(n-2);

    }
}