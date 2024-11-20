package Backtraking;

import java.util.Arrays;

public class allPaths {
    public static void main(String[] args) {
        boolean[][] board={
                {true,true,true},
                {true,true,true},
                {true,true,true},
        };
//        traversePaths("",board,0,0);
//        System.out.println(traversePathsCount("",board,0,0));
        int[][] paths=new int[board.length][board[0].length];
        traversePathsPrint("",board,0,0,paths,1);
    }
    static void traversePaths(String p,boolean[][] maze, int r, int c){
        if(r==maze.length-1 && c==maze[0].length-1){
            System.out.println(p);
            return;
        }

        if(!maze[r][c]){
            return;
        }
        maze[r][c]=false;

        //  for down
        if(r<maze.length-1){
            traversePaths(p+'D',maze,r+1,c);
        }
        //for right
        if(c<maze[0].length-1){
            traversePaths(p+'R',maze,r,c+1);
        }

        //for up
        if(r>0){
            traversePaths(p+'U',maze,r-1,c);
        }
        //for left
        if (c>0){
            traversePaths(p+'L',maze,r,c-1);
        }

        maze[r][c]=true;
    }
    static int traversePathsCount(String p,boolean[][] maze, int r, int c){
        if(r==maze.length-1 && c==maze[0].length-1){
          return 1;
        }
int count=0;
        if(!maze[r][c]){
            return 0;
        }
        maze[r][c]=false;

        //  for down
        if(r<maze.length-1){
            count+=traversePathsCount(p+'D',maze,r+1,c);
        }
        //for right
        if(c<maze[0].length-1){
            count+=traversePathsCount(p+'R',maze,r,c+1);
        }

        //for up
        if(r>0){
            count+=traversePathsCount(p+'U',maze,r-1,c);
        }
         //for left
        if (c>0){
            count+=traversePathsCount(p+'L',maze,r,c-1);
        }

        maze[r][c]=true;
        return count;
    }
        static void traversePathsPrint(String p,boolean[][] maze, int r, int c, int[][] paths, int step){
        if(r==maze.length-1 && c==maze[0].length-1){
            paths[r][c]=step;
          for (int[] arr: paths){
              System.out.println(Arrays.toString(arr));
          }
            System.out.println(p);
            System.out.println();
            return;
        }

        if(!maze[r][c]){
            return;
        }
        maze[r][c]=false;
        paths[r][c]=step;
        //  for down
        if(r<maze.length-1){
            traversePathsPrint(p+'D',maze,r+1,c,paths,step+1);
        }
        //for right
        if(c<maze[0].length-1){
            traversePathsPrint(p+'R',maze,r,c+1,paths,step+1);
        }

        //for up
        if(r>0){
            traversePathsPrint(p+'U',maze,r-1,c,paths,step+1);
        }
        //for left
        if (c>0){
            traversePathsPrint(p+'L',maze,r,c-1,paths,step+1);
        }

        maze[r][c]=true;
        paths[r][c]=0;
    }

}
