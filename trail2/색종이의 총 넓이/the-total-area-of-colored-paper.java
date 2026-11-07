import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] arr = new int[201][201];


        for (int i = 0; i < n; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();

            for(int j = a; j<=a+7; j++){
                for(int z = b; z<=b+7; z++) {
                    arr[j+100][z+100] = 1;
              }
         }
        }
        int count = 0;

        for(int i = 0; i<arr.length; i++){
            for(int j = 0; j<arr[0].length; j++){
                if(arr[i][j] == 1){
                    count++;
                }
            }
        }
        System.out.print(count);
    }
}