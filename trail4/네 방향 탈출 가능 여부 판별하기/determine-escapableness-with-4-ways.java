import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[][] grid = new int[n][m];
        for (int i = 0; i < n; i++)
            for (int j = 0; j < m; j++)
                grid[i][j] = sc.nextInt();
        
        int x = 0;
        int y = 0;
        boolean[][] visited = new boolean[n][m];
        int[] dx = {1,-1,0,0};
        int[] dy = {0,0,-1,1};
        Queue<int[]> q = new ArrayDeque<>();

        q.offer(new int[] {x,y});
        visited[x][y] = true;



        while(!q.isEmpty()) {
            int[] arr = q.poll();
            x = arr[0];
            y = arr[1];

            for(int i = 0; i<4; i++) {
                int nx = x + dx[i];
                int ny = y + dy[i];

                if(nx<n && ny<m && nx>=0 && ny>=0 && visited[nx][ny] != true &&  grid[nx][ny] != 0){
                    q.offer(new int[] {nx, ny});
                    visited[nx][ny] = true;

                    if(nx == n-1 && ny == m-1){
                        System.out.print("1");
                        return;
                    }
                }
            }
        }
        System.out.print("0");

    }
}