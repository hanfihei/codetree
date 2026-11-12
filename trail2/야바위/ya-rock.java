import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[][] arr = new int[n][3];

        for(int i = 0; i < n; i++){
            for(int j = 0; j < 3; j++){
                arr[i][j] = sc.nextInt();
            }
        }

        int[] sum = new int[4];

        for(int j = 1; j < 4; j++){
            int nn = 0;
            int jo = j;

            for(int i = 0; i < n; i++){

                if(arr[i][0] == jo){
                    jo = arr[i][1];
                }
                else if(arr[i][1] == jo){
                    jo = arr[i][0];
                }

                if(arr[i][2] == jo){
                    nn++;
                }
            }

            sum[j] = nn;
        }

        Arrays.sort(sum);
        System.out.print(sum[3]);
    }
}