import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int[][] arr = new int[n][2];
        int max = 0;

        for (int i = 0; i < n; i++) {
            arr[i][0] = sc.nextInt();
            arr[i][1] = sc.nextInt();
            
            if(arr[i][1] > max){
                max = arr[i][1];
            }
        }
        int sum = 0;

        for(int i = 1; i<=max; i++) {
            int count = 0;
            int c = i-k;
            int cc = i+k;

            for(int j = 0; j<n; j++){
                if(arr[j][1] >= c && arr[j][1] <= cc)
                    count += arr[j][0];
            }
            if(count > sum)
                sum = count;
        }
        System.out.print(sum);
        
    }
}