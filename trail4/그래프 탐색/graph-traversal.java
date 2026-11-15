import java.util.Scanner;
public class Main {
    static int n;
    static int m;
    static int count = 0;
    static int[][] g;
    static boolean[] visited;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        m = sc.nextInt();

        g = new int[n+1][n+1];
        visited = new boolean[n+1];
        visited[1] = true;

        for (int i = 1; i <=m; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();

            g[a][b] = 1;
            g[b][a] = 1;
        }
        dfs(1);

        System.out.print(count);
        
    }

    public static void dfs(int x) {

        for(int i = 1; i<=n; i++) {
            if(!visited[i] && g[x][i] == 1) {
                visited[i] = true;
                count++;
                dfs(i);
                
            }
        }
        

    }
}