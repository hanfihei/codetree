import java.util.Scanner;
public class Main {
    static boolean[][]  visited;
    static int[][] g;
    static int n;
    static int m;
    static boolean success = false;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        m = sc.nextInt();
        g = new int[n][m];
        visited = new boolean[n][m];

        for (int i = 0; i < n; i++)
            for (int j = 0; j < m; j++)
                g[i][j] = sc.nextInt();

        dfs(0,0);

        System.out.print(success ? "1" : "0");


        
    }
    public static void dfs(int x, int y) {
        visited[x][y] = true;
        int[] dx = {0, 1};
        int[] dy = {1, 0};
        
                    for (int i = 0; i < 2; i++) {
                        int nx = x + dx[i];
                        int ny = y + dy[i];

                        if(nx<n && ny<m && !visited[nx][ny] && g[nx][ny] == 1){
                            dfs(nx, ny);
                            if(nx == n-1 && ny == m-1){
                                success = true;
                                return;
                                
                            }

                        }

                         
                    }

                }
            }
            
        
    