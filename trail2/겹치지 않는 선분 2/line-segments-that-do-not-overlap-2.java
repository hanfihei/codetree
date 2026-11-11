import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int count = 0;
        int[][] arr = new int[n][2];
        for (int i = 0; i < n; i++) {
            arr[i][0] = sc.nextInt();
            arr[i][1] = sc.nextInt();
        }

        for(int i = 0; i<n; i++) {
            int a = arr[i][0];
            int b = arr[i][1];
            int ox = 1;
            for(int j = 0; j<n; j++) {
                if(i!=j) {
                    if(a > arr[j][0] && b < arr[j][1] || a < arr[j][0] && b > arr[j][1]){
                        ox = 0;
                    }
                }
                if(ox == 0){
                    break;
                }
            }
            if(ox == 1){
                count++;
            }
        }
        System.out.print(count);
        

    }
}