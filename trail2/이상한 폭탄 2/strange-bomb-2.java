import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int max = -1;
        int n = sc.nextInt();
        int k = sc.nextInt();

        int[] bo = new int[n];
        for (int i = 0; i < n; i++) {
            bo[i] = sc.nextInt();
        }

        for(int i = 0; i<n; i++) {
            for(int j = i+1; j<n; j++) {
                if(bo[i] == bo[j]) {
                    if(j-i <= k){
                        if(bo[i] > max)
                            max = bo[i];
                    }
                }
            }
        }
        System.out.print(max);
        
    }
}