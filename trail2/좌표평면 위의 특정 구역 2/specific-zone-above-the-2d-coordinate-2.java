import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        
        int[][] arr = new int[N+1][2];
        for (int i = 1; i <= N; i++) {
            arr[i][0] = sc.nextInt();
            arr[i][1] = sc.nextInt();
        }
        int result = 0;

        int min = Integer.MAX_VALUE;
        int xx = 0;
        int yy = 0;
        
        for(int i = 1; i<=N; i++) {
            int x = 0;
            int y = 0;
            int minx = Integer.MAX_VALUE;
            int miny = Integer.MAX_VALUE;
            for(int j = 1; j<=N; j++) {
                if(j!=i){
                    xx = arr[j][0];
                    yy = arr[j][1];
                    
                    if(xx>x)
                        x = xx;
                    if(yy>y)
                        y = yy;
                    if(minx>xx)
                        minx = xx;
                    if(miny>yy)
                        miny = yy;
                }
            }
            int num1 = x-minx;
            int num2 = y-miny;
            int sum = num1 * num2;
            if(sum<min){
                min = sum;
                result = min;
            }
        }
        System.out.print(result);
    }
}