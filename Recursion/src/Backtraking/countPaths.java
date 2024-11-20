package Backtraking;

import java.util.ArrayList;

public class countPaths {
    public static void main(String[] args) {
        System.out.println(pathCount(3,3));
        pathPrint("",3,3);
        System.out.println(pathReturn("",3,3));
        System.out.println(pathsDiagonal("",3,3));
        System.out.println(pathReturnZero("",1,1));

        boolean[][] board={
                {true,true,true},
                {true,false,true},
                {true,true,true},
        };
        pathObstacle("",board,0,0);
    }
    static int pathCount(int r , int c){
        if(r==1 || c==1){
            return 1;
        }
        int right=pathCount(r,c-1);
        int down=pathCount(r-1,c);
        return right+down;
    }
    static void pathPrint(String paths, int r , int c){
        if(r==1 && c==1){
            System.out.println(paths);
            return;
        }

        if(c>1){
            pathPrint(paths+'R',r,c-1);
        }
        if (r>1){
            pathPrint(paths+'D',r-1,c);
        }
    }
     static ArrayList<String> pathReturn(String paths, int r , int c){
        if(r==1 && c==1){
            ArrayList<String> list=new ArrayList<>();
            list.add(paths);
            return list;
        }
     ArrayList<String> list=new ArrayList<>();
        if(c>1){
            list.addAll(pathReturn(paths+'R',r,c-1));
        }
        if (r>1){
            list.addAll(pathReturn(paths+'D',r-1,c));
        }

        return list;
    }
    static ArrayList<String> pathsDiagonal(String paths, int r , int c){
        if(r==1 && c==1){
            ArrayList<String> list=new ArrayList<>();
            list.add(paths);
            return list;
        }
     ArrayList<String> list=new ArrayList<>();
        if (r>1 && c>1){
            list.addAll(pathsDiagonal(paths+'D',r-1,c-1));
        }
        if(c>1){
            list.addAll(pathsDiagonal(paths+'H',r,c-1));
        }
        if (r>1){
            list.addAll(pathsDiagonal(paths+'V',r-1,c));
        }

        return list;
    }
static ArrayList<String> pathReturnZero(String paths, int r , int c){
        if(r==3 && c==3){
            ArrayList<String> list=new ArrayList<>();
            list.add(paths);
            return list;
        }
     ArrayList<String> list=new ArrayList<>();
        if(c<3){
            list.addAll(pathReturnZero(paths+'R',r,c+1));
        }
        if (r<3){
            list.addAll(pathReturnZero(paths+'D',r+1,c));
        }

        return list;
    }

    static void pathObstacle(String paths,boolean[][] maze,int r , int c){
        if(r==maze.length-1 && c==maze[0].length-1){
            System.out.println(paths);
            return;
        }
     if(!maze[r][c]){
         return;
     }
        if(c<maze[0].length-1){
            pathObstacle(paths+'R',maze,r,c+1);
        }
        if (r<maze.length-1){
            pathObstacle(paths+'D',maze,r+1,c);
        }
    }
}
