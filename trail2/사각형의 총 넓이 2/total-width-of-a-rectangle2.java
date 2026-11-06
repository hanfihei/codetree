import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int size = 0;


        int[][] arr = new int[201][201];
        for(int i = 0; i<n; i++){
            int x1 = sc.nextInt();
            int y1 = sc.nextInt();
            int x2 = sc.nextInt();
            int y2 = sc.nextInt();
            for(int j = x1; j<x2; j++){
                for(int z = y1; z<y2; z++){
                    arr[j+100][z+100] = 1;
                }
            }
        }

        for(int i = 0; i<arr[0].length; i++){
            for(int j = 0; j<arr.length; j++){
                if(arr[i][j] == 1)
                    size++;
            }
        }

        
        System.out.print(size);
        
    }
}