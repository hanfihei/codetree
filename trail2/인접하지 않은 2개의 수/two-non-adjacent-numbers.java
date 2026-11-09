import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        int max = 0;
        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }
        for(int i = 0; i<arr.length; i++){
            int num = arr[i];
            int sum = 0;
            for(int j = 0; j<arr.length; j++){
                if(j!=i && j+1 != i && j-1 !=i){
                    sum = arr[i] + arr[j]; 
                }
                if(sum > max)
                    max = sum;
            }
        }
        System.out.print(max);
    }
}