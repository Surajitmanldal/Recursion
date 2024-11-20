public class reduceZero {
    //leetcode 1342
    public static void main(String[] args) {
        int n=14;
        System.out.println(stepsTo0(n));
        System.out.println(step(n));
    }
    static int stepsTo0(int num){
        int count=0;
        if(num==0){
            return count;
        }
        if(num%2==0){
            return stepsTo0(num/2)+(count+1);
        }
        else{
            return stepsTo0(num-1)+(count+1);
        }
    }
    static int step(int num){
        int count=0;
        while (num!=0){
            if(num%2==0){
                count++;
                num/=2;
            }
            else{
                count++;
                num--;
            }
        }
        return count;
    }
}
