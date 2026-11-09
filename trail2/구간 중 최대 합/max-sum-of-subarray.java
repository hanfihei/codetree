import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int max = 0;
        int[] arr = new int[n];
        for (int i = 0; i < n; i++)
            arr[i] = sc.nextInt();
        
        for(int i = 0; i<=n-k; i++){
            int a = 0;
            for(int j = i; j<i+k; j++) {
                a += arr[j];
            }
            if(a>max)
                max = a;
            
        }

        System.out.print(max);
    }
}