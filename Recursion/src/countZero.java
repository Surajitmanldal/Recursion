public class countZero {
    public static void main(String[] args) {
        int n= 30204;
        System.out.println(count0(n,0));
        System.out.println(count0ag(n,0));
    }
    static int count0(int n,int count){
        while (n!=0){
            int rem=n%10;
             if(rem==0){
                 count++;
             }
             n/=10;
        }
        return count;
    }
    static int count0ag(int n,int count){
       if(n==0){
           return count;
       }
       int rem=n%10;
       if(rem==0){
           return count0ag(n/10,count+1);
       }
       else{
           return count0ag(n/10,count);
       }
    }
}
