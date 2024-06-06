import java.util.ArrayList;
import java.util.List;

public class MazeProblems {
    public static void main(String[] args) {
//        printPath1("", 3, 3);
//        printPath2("", 3, 3);
//        System.out.println(returnPath1("", 3, 3));
//        System.out.println(returnPath2("", 3, 3));
//        System.out.println(returnPath3("", 3, 3));

        boolean[][] maze = new boolean[][]{
                {true,true,true},
                {true,false,true},
                {true,true,true}
        };

        printPath(maze, "", maze.length, maze[0].length);
    }

    static void printPath1(String out, int row, int col){
        if(row==1 && col==1){
            System.out.println(out);
        }
        if (row>1){
            printPath1(out+"D", row-1, col);
        }
        if (col>1){
            printPath1(out+"R", row, col-1);
        }
    }

    static void printPath2(String out, int row, int col){
        if(row==1 && col==1){
            System.out.println(out);
        }
        if (col>1){
            printPath2(out+"H", row, col-1);
        }
        if(row>1 && col>1){
            printPath2(out+"D", row-1, col-1);
        }
        if (row>1){
            printPath2(out+"V", row-1, col);
        }
    }

    static ArrayList<String> returnPath1(String out, int row, int col){
        if(row==1 && col==1){
            ArrayList<String> list = new ArrayList<>();
            list.add(out);
            return  list;
        }

        ArrayList<String> list = new ArrayList<>();

        if (row>1){
            list.addAll(returnPath1(out+"D", row-1, col));
        }
        if (col>1){
            list.addAll(returnPath1(out+"R", row, col-1));
        }

        return list;
    }

    static ArrayList<String> returnPath2(String out, int row, int col){
        ArrayList<String> list = new ArrayList<>();
        solve(out, row, col, list);
        return list;
    }

    static void solve(String out, int row, int col, List<String> list){
        if(row==1 && col==1){
            list.add(out);
        }

        if (row>1){
            solve(out+"D", row-1, col, list);
        }

        if (col>1){
            solve(out+"R", row, col-1, list);
        }
    }

    static ArrayList<String> returnPath3(String out, int row, int col){
        if(row==1 && col==1){
            ArrayList<String> list = new ArrayList<>();
            list.add(out);
            return  list;
        }

        ArrayList<String> list = new ArrayList<>();

        if (col>1){
            list.addAll(returnPath3(out+"H", row, col-1));
        }
        if (row>1 && col>1){
            list.addAll(returnPath3(out+"D", row-1, col-1));
        }
        if (row>1){
            list.addAll(returnPath3(out+"V", row-1, col));
        }

        return list;
    }

    static void printPath(boolean[][] maze, String out, int row, int col){
        if (row == maze.length && col == maze[0].length) {
            System.out.println(out);
        }
        if (row < maze.length) {
            printPath(maze, out + "D", row + 1, col);
        }
        if (col < maze[0].length) {
            printPath(maze, out + "R", row, col + 1);
        }
    }


}
