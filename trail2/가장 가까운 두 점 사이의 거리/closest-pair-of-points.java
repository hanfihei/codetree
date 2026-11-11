import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] arr = new int[n][2];

        for (int i = 0; i < n; i++) {
            arr[i][0] = sc.nextInt();
            arr[i][1] = sc.nextInt();
        }

        int min = Integer.MAX_VALUE;
        int a = 0;
        int b = 0;

        for(int i = 0; i<n; i++) {
            for(int j = i+1; j<n; j++) {
                a = arr[i][0] - arr[j][0];
                b = arr[i][1] - arr[j][1];

                a *= a;
                b *= b;

                if(min > a+b)
                    min = a+b;
            }

            
        }

        System.out.print(min);

        
    }
}