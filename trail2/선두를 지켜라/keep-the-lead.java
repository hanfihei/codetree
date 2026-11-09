import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int now = 0;
        int time = 0;
        int[] A = new int[1000001];
        for (int i = 0; i < n; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            
            for(int j = now+1; j<=now+b; j++){
                A[j] = A[j-1] + a;
                time++;
            }
            now += b;
        }

        now = 0;
        int[] B = new int[1000001];
        for (int i = 0; i < m; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            
            for(int j = now+1; j<=now+b; j++){
                B[j] = B[j-1] + a;
            }
            now += b;
        }

        

        int ox = -1;
        int result = 0;

        for(int i = 0; i<=time; i++){
            if(B[i] > A[i] && ox != 1){
                if(ox != -1){
                    result++;
                }
                ox = 1;
            }
            else if((A[i]> B[i]) && ox != 0){
                if(ox != -1){
                    result++;
                }
                ox = 0;
            }
        }

        System.out.print(result);
        
    }
}