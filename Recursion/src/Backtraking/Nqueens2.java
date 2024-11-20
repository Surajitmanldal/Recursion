package Backtraking;

public class Nqueens2 {
    public static void main(String[] args) {
        int n=4;
           boolean[][] board=new boolean[n][n];
        System.out.println(NQueens(board,0));
    }
    static int NQueens(boolean[][]  board, int row){
        if (row==board.length){
            display(board);
            System.out.println();
            return 1;
        }
        int count=0;

        for (int col=0;col<board.length;col++){

            if (isSafe(board,row,col)){
                board[row][col]=true;
                count+= NQueens(board,row+1);
                board[row][col]=false;
            }
        }
        return count;
    }
    static boolean isSafe(boolean[][] board, int row, int col){
        //this loop check for above safe position
        for (int i=0;i<row;i++){
            if (board[i][col]){
                return false;
            }
        }

        // this loop checks for left diagonal
        int maxLeft=Math.min(row,col);
        for (int i=1;i<=maxLeft;i++){
            if (board[row-i][col-i]){
                return false;
            }
        }

        //This loop checks for right diagonal

        int maxRight=Math.min(row,board.length-col-1);
        for (int i=1;i<=maxRight;i++){
            if (board[row-i][col+i]){
                return false;
            }
        }
        //if all condition are false that means this is the safe position
        return true;
    }
    static void display(boolean[][] board){
        for (boolean[] row: board){
            for (boolean element : row){
                if (element){
                    System.out.print("Q ");
                }
                else{
                    System.out.print("X ");
                }
            }
            System.out.println();
        }
    }
}
