import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int sum = 0;
        
        int[][] arr = new int[N][2];
        int max = 0;
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < N; i++) {
            arr[i][0] = sc.nextInt();
            arr[i][1] = sc.nextInt();

            if(arr[i][0]< min){
                min = arr[i][0];
            }
            if(arr[i][1] > max){
                max = arr[i][1];
            }
        }
        int[] a = new int[max+1];
        int count = 0;

        for(int i = 0; i<N; i++) {
            count = 0;
            
            for(int j = 0; j<N; j++) {
                if(j!=i){
                    int aa = arr[j][0];
                    int b = arr[j][1];
                    for(int k = aa; k<b; k++){
                        a[k] = 1;
                }
                }
            }
            for(int x = 0; x<a.length; x++) {
                if(a[x] == 1)
                    count++;

                a[x] = 0;
            }
            
            if(count > sum)
                sum = count;
        }

        System.out.print(sum);

        
    }
}