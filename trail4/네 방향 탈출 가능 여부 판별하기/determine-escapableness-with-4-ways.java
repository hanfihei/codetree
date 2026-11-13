import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Queue<int[]> q = new ArrayDeque<>();
        int[] arr = {0,0};
        q.offer(arr);

        int n = sc.nextInt();
        int m = sc.nextInt();
        int x = 0;
        int y = 0;
        int nx = 0;
        int ny = 0;
        boolean[][] visited = new boolean[n][m];
        visited[0][0] = true;

        int[] dx = {1,-1,0,0}; //동서남북
        int[] dy = {0,0,-1,1};
        int[][] grid = new int[n][m];
        for (int i = 0; i < n; i++)
            for (int j = 0; j < m; j++)
                grid[i][j] = sc.nextInt();

        while(!q.isEmpty()) {
            int[] a = q.poll();
            x  = a[0];
            y =  a[1];
            for(int i = 0; i<4; i++){
                nx = x + dx[i];
                ny = y + dy[i];
                if(nx < 0 || ny < 0 || nx > n-1 || ny > m-1)
                    continue;
                else if(visited[nx][ny] == false && grid[nx][ny] == 1)   {
                    q.offer(new int[] {nx,ny});
                    visited[nx][ny] = true;
                }
                if(nx == n-1 && ny == m-1 && grid[n-1][m-1] == 1 && visited[nx][ny] == true){
                System.out.print("1");
                return;
            }
            }
            

        }
        System.out.print("0");

        
    }
}