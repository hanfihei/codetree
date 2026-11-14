import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int count = 0;
        int n = sc.nextInt();
        int k = sc.nextInt();
        int[][] grid = new int[n][n];


        int[] dx = {1,-1,0,0};
        int[] dy = {0,0,-1,1};
        Queue<int[]> q = new ArrayDeque<>();
        int[][] visited = new int[n][n];


        for (int i = 0; i < n; i++)
            for (int j = 0; j < n; j++)
                grid[i][j] = sc.nextInt();



        for (int i = 0; i < k; i++) {
            int x = sc.nextInt();
            int y = sc.nextInt();
            x--;
            y--;
            visited[x][y] = 2;


            if(visited[x][y] != 1){

                q.offer(new int[] {x,y});

                while(!q.isEmpty()) {
                    int[] arr = q.poll();
                    x = arr[0];
                    y = arr[1];

                    for(int j = 0; j<4; j++) {
                        int nx = x + dx[j];
                        int ny = y + dy[j];

                        if(nx<n && ny<n && nx >= 0 && ny >= 0 && grid[nx][ny] != 1 && visited[nx][ny] != 2) {
                            q.offer(new int[] {nx, ny});
                            visited[nx][ny] = 2;


                        } 
                    }
                }

            }

        }

        for(int i = 0; i<n; i++) {
            for(int j = 0; j<n; j++) {
                if(visited[i][j] == 2){
                    count++;
                }
            }
        }
        System.out.print(count);


        
        

        
    }
}