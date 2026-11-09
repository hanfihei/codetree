import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[] dx = new int[]{1,-1,0,0};
        int[] dy = new int[]{0,0,-1,1};
        int[][] arr = new int[n][n];
        int count = 0;
        int[] num = new int[m];
   
        
        for (int i = 0; i < m; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();

            arr[a-1][b-1] = 1;
            count = 0;

            for(int j = 0; j<4; j++){
                int nx = (a-1) + dx[j];
                int ny = (b-1) + dy[j];

                if(nx >= 0 && ny >= 0 && nx < n && ny < n && arr[nx][ny] == 1){
                    count++;
                }
            }
            if(count==3){
                num[i] = 1;
            }
            else
                num[i] = 0;
            

            

        }

        for(int i = 0; i<m; i++){
            System.out.println(num[i]);
        }

        
    }
}