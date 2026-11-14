import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int min = Integer.MAX_VALUE;
        int[][] step = new int[n][m];
        step[0][0] = 0;
        int[][] a = new int[n][m];
        boolean[][] visited = new boolean[n][m];
        Queue<int[]> q = new ArrayDeque<>();
        int[] dx = {1,-1,0,0};
        int[] dy = {0,0,-1,1};

        for (int i = 0; i < n; i++)
            for (int j = 0; j < m; j++)
                a[i][j] = sc.nextInt();

        visited[0][0] = true;
        int x = 0;
        int y = 0;
        q.offer(new int[] {x,y});

        while(!q.isEmpty()) {
            int[] arr = q.poll();
            x = arr[0];
            y = arr[1];
            
            for(int i = 0; i<4; i++) {
                int nx = x + dx[i];
                int ny = y + dy[i];

                if(nx<n && ny<m && nx>=0 && ny>=0 && visited[nx][ny] == false && a[nx][ny] == 1){
                    q.offer(new int[] {nx,ny});
                    step[nx][ny] = step[x][y] + 1;
                    visited[nx][ny] = true;

                    if(nx == n-1 && ny == m-1){
                        int num = step[nx][ny];
                        if(min>num)
                            min = num;
                    }
                }
            }
        }

        if(min<9999)
            System.out.print(min);
        else
            System.out.print("-1");
        
        
    }
}