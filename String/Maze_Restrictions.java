import java.util.Scanner;

public class Maze_Restrictions
{
    public static void main(String[] arovius)
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the value of n for nxn matrix : ");
        int n = sc.nextInt();

        boolean[][] maze = {
            {true, true, true},
            {true, false, true},
            {true, true, true}
        };

        printPath("", 0, 0 , maze);
        
    }
    public static void printPath(String p, int r, int c, boolean[][] maze)
    {
       // if(r == maze.length && c == maze[0].length)   return;

        if(r==maze.length-1 && c == maze[0].length-1)
        {
            System.out.println(p);
            return;
        }

        if(!maze[r][c])
            return;

         if(r < maze.length-1 && c < maze[0].length-1)
            printPath(p+'C', r+1, c+1, maze);
        
        if(r < maze.length-1)
            printPath(p+'D', r+1, c, maze);
        
        if(c < maze[0].length-1)
            printPath(p+'R', r, c+1, maze);
    }
}