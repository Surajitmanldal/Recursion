package Backtraking;

import java.util.ArrayList;
import java.util.List;

public class QueensReturn {
    public static void main(String[] args) {
          int n=4;
        List<List<String>> list=queens(n);
        for (List <String> li: list){
            System.out.println(li);
        }
    }
    static List<List<String>> queens(int n){
        boolean[][] board=new boolean[n][n];
        List<List<String>> list=new ArrayList<>();
        queensReturn(board,0,list);
        return list;
    }
    static  void queensReturn(boolean[][] board,int row,List<List<String>> result){
        if (row==board.length){
            result.add(chessBoard(board));
            return;
        }
        for (int col=0;col<board.length;col++){
            if (isSafe(board,row,col)){
                board[row][col]=true;
                queensReturn(board,row+1,result);
                board[row][col]=false;
            }
        }
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
    static List<String> chessBoard(boolean[][] board){
        List<String> list=new ArrayList<>();
        for (boolean[] row: board){
            StringBuilder sb=new StringBuilder();
            for (boolean element : row){
                if (element){
                    sb.append("Q");
                }
                else{
                    sb.append(".");
                }
            }
           list.add(sb.toString());
        }
        return list;
    }
}
