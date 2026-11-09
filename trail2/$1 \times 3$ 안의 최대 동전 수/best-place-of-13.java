import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int max = 0;
        int count = 0;
        int[][] grid = new int[n][n];
        for (int i = 0; i < n; i++)
            for (int j = 0; j < n; j++)
                grid[i][j] = sc.nextInt();


        int len = n-2;
        
        for(int i = 0; i<n; i++){
            for(int j = 0; j<len; j++){
                count = 0;
                for(int z = j; z<j+3; z++){
                    if(grid[i][z] == 1) {
                        count++;
                    }
                } 
                if(count > max){
                    max = count;
                }
                
            }
        }

        System.out.print(max);
    }
}