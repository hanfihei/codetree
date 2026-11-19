import java.util.Scanner;
public class Main {
    static boolean visited[][];
    static  int success;
    static int[][] g;
    static int n;
    static int m;


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        m = sc.nextInt();
        success = 0;
        g = new int[n][m];

        for (int i = 0; i < n; i++)
            for (int j = 0; j < m; j++)
                g[i][j] = sc.nextInt();

        visited = new boolean[n][m];
        visited[0][0] = true;

        success = dfs(0,0);        
        System.out.print(success);
        
    }
    public static int dfs(int x, int y) {
        int[] dx = {1,0};
        int[] dy  = {0,1};
        visited[x][y] = true;

        for(int i = 0; i<2; i++) {
            int nx = x + dx[i];
            int ny = y + dy[i];
            if(nx<n && ny<m && visited[nx][ny] == false && g[nx][ny] == 1){
                if(nx == n-1 && ny == m-1){
                    success = 1;
                    break;
                }
                dfs(nx, ny);  
            }
            
        }
        return success;

    }
}