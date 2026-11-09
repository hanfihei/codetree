import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] dx = new int[]{1,-1,0,0};
        int[] dy = new int[]{0,0,-1,1};
        int[][] arr = new int[101][101];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        int count = 0;
        int result = 0;

        for(int i = 0; i<n; i++){
            for(int j = 0; j<n; j++){
                for(int z = 0; z<4; z++){
                    int nx = i + dx[z];
                    int ny = j + dy[z];

                    if(nx >= 0 && ny >= 0 && arr[nx][ny] == 1 && nx<n && ny<n){
                        count++;
                    }
                }
                if(count > 2)
                    result++;
                
                count = 0;
                }
                
            }
            System.out.print(result);
        }
        
    }
