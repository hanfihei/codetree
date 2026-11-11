import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int c = sc.nextInt();
        int g = sc.nextInt();
        int h = sc.nextInt();
        int[][] arr = new int[n+1][2];
        int max = Integer.MIN_VALUE;

        for (int i = 0; i < n; i++) {
            arr[i][0] = sc.nextInt();
            arr[i][1] = sc.nextInt();
        }

        for(int i = -1; i<=1001; i++) {
            int sum = 0;
            for(int j = 0; j<n; j++) {
                if(i<arr[j][0])
                    sum += c;
                else if(i>=arr[j][0] && i<=arr[j][1])
                    sum += g;
                else
                    sum += h;
            }
            // System.out.println(sum);
            if(sum>max)
                max = sum;
        }

        System.out.print(max);
        
    }
}