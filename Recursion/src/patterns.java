public class patterns {
    public static void main(String[] args) {
//        pattern1(3,0);
//        pattern2(4,0,4);
//        pattern3(1,1,1);
        pattern4(4,0,0);
    }
static void pattern1(int row, int col){
       if(row==0){
           return;
       }

       if(col<row){
           System.out.print("*");
           pattern1(row,col+1);
       }
       else {
           System.out.println();
           pattern1(row - 1, 0);
       }
}

static void pattern2(int row,int col, int sp){
        if(row==0){
            return;
        }
        if(sp>row){
            System.out.print(" ");
            pattern2(row,col,sp-1);
        }
       else if(col<row){
            System.out.print("* ");
            pattern2(row,col+1,sp);
        }
      else {
            System.out.println();
            pattern2(row - 1, 0, 4);
        }

}
static void pattern3(int row, int col,int sp){
        if(row==5){
            return ;
        }

        if(sp<=5-row){
            System.out.print(" ");
            pattern3(row,col,sp+1);
        }
        else if(col<= (2*row)-1){
            System.out.print("*");
            pattern3(row,col+1,sp);
        }
        else{
            System.out.println();
            pattern3(row+1,1,1);
        }
}
static void pattern4(int row , int col,int sp){
        if(row==0){
            return;
        }
        if(sp<row){
            System.out.print(" ");
            pattern4(row,col,sp+1);
        }
        else if(col<row){
            pattern4(row,col+1,sp);
            System.out.print("*");
        }
        else {

            pattern4(row-1,0,0);
            System.out.println();
        }
}
}
