import java.util.Scanner;

public class Maze
{
    public static void main(String[] arovius)
    {
        Scanner sc = new Scanner(System.in);
    
        System.out.print("Enter the size of nxn matrix : ");
        int n = sc.nextInt();

        System.out.print("\nEnter the path information : ");
        boolean[][] pathINFO = new boolean[n][n];
        
        for(int i=0; i<n; i++)
        {
            for(int j=0; j<n; j++)
                pathINFO[i][j] = sc.nextBoolean();
        }
        boolean[][] maze = new boolean[n][n];
        int[][] pathArr = new int[n][n];

        for(int i=0; i<n ; i++)
        {
            for(int j=0; j<n; j++)
                maze[i][j] = true;
        }
        printPath("", n, n, pathINFO, maze, pathArr, 1);
    }
    static int count(int r, int c)
    {
        if(r==1 || c==1)    return 1;

        int left = count(r-1,c);
        int right = count(r, c-1);
        return left+right;
    }
    
    static void printPath(String path, int r, int c, boolean[][] pathINFO, boolean[][] maze, int[][] pathArr, int step)
    {
        if(!maze[r][c])     return;

        maze[r][c] = false;
        pathArr[r][c]= step;
        if(!pathINFO[r-1][c-1])     return;

        if(r==maze.length-1 && c==maze[0].length)
        {
            System.err.println(path);
            System.out.println(step);
            return;
        }
        
        if(r<maze.length && c < maze[0].length)
        {
            printPath(path + 'D', r-1, c-1, pathINFO, maze, pathArr, step+1);
        }
        if(r<maze.length)
        {
            printPath(path + 'V', r-1, c, pathINFO, maze, pathArr ,step+1);
        }
        if(c < maze[0].length)
        {
            printPath(path+'H', r, c-1, pathINFO, maze, pathArr ,step+1);
        }
        if(r>1)
        {
            printPath(path + 'U', r-1, c, pathINFO, maze, pathArr ,step+1);
        }
        if(c>1)
        {
            printPath(path + 'L', r, c-1, pathINFO, maze, pathArr, step+1);
        }
        maze[r][c] = true;
        step=1;
        pathArr[r][c]=0;
    }
}