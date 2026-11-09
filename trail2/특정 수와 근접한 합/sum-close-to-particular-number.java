import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int s = sc.nextInt();
        int di = 100000;
        int num = 0;
        int[] arrs = new int[10000];
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        for(int i = 0; i<n; i++){
            for(int j = i+1; j<n; j++) {
                int sum = 0;
                for(int z = 0; z<n; z++) {
                    if(z != i && z != j){
                        sum += arr[z];
                    }
                }
                if(sum > s && di > sum - s){
                    di = sum - s;
                }
                else if(sum < s && di > s - sum){
                    di = s - sum;
                }
                else if(sum == s){
                    di = 0;
                }
            }
        }
        System.out.print(di);
        
    }
}