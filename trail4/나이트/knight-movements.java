import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int r1 = sc.nextInt();
        int c1 = sc.nextInt();
        int r2 = sc.nextInt();
        int c2 = sc.nextInt();

        boolean[][] visited = new boolean[n][n];
        int x = r1-1;
        int y = c1-1;
        int[][] step = new int[n][n];
        int[] dx = {-1, -2, -2, -1, 1, 2, 2, 1 };
        int[] dy = {-2, -1, 1, 2, 2, 1, -1, -2};
        Queue<int[]> q = new ArrayDeque<>();
        visited[x][y] = true;
        step[x][y] = 0;
        q.offer(new int[] {x,y});

        if(r1== r2 && c1 == c2){
            System.out.print("0");
            return;
        }

        while(!q.isEmpty()) {
            int[] arr = q.poll();
            x = arr[0];
            y = arr[1];

            for(int i = 0; i<8; i++) {
                int nx = x + dx[i];
                int ny = y + dy[i];

                if(nx<n && ny < n && nx>=0 && ny>=0 && visited[nx][ny] == false) {
                    q.offer(new int[] {nx,ny});
                    visited[nx][ny] = true;
                    step[nx][ny] += step[x][y] +1;

                    if(nx==r2-1 && ny==c2-1){
                        System.out.print(step[nx][ny]);
                        return;
                    }

                }

            }

        }
        System.out.print("-1");


        
    }
}