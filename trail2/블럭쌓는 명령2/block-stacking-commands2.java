import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int K = sc.nextInt();
        int[] arr = new int[N+1];

        for(int i = 0; i<K; i++){
            int a = sc.nextInt();
            int b = sc.nextInt();

            for(int j = a; j<=b; j++)
                arr[j]++;
        }

        Arrays.sort(arr);
        System.out.print(arr[arr.length-1]);
        
    }
}