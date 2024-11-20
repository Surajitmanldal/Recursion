package Backtraking;

import static Backtraking.NQueens.display;
import static Backtraking.NQueens.isSafe;

public class NqueenRcecursion{
    public static void main(String[] args) {
        int n=4;
        boolean[][] boaard=new boolean[n][n];
       nQueens(boaard,0,0);
    }
    static void nQueens(boolean[][] board, int row, int col) {
    // Base case: all queens are placed
    if (row == board.length) {
        display(board);
        System.out.println();
        return;
    }

    // If we have exhausted columns for this row, backtrack
    if (col == board.length) {
        return;
    }

    // Try placing a queen at (row, col) if it's safe
    if (isSafe(board, row, col)) {
        // Place the queen
        board[row][col] = true;

        // Recurse to the next row, starting column 0
        nQueens(board, row + 1, 0);

        // Backtrack: remove the queen
        board[row][col] = false;
    }

    // Recurse to try the next column in the current row

        nQueens(board, row, col + 1);
}

}
