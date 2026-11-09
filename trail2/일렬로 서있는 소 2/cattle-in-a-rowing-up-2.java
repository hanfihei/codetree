import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        int count = 0;
        for (int i = 0; i < n; i++)
            arr[i] = sc.nextInt();

        for(int i = 0; i<n; i++){
            int num = arr[i];
            for(int j = i+1; j<n; j++){
                int num2 = arr[j];
                if(num<=num2){
                    for(int z = j+1; z<n; z++){
                    int num3 = arr[z];
                    if(num2<=num3){
                        count++;
                    }
                }

                }
                
            }
        }
        System.out.print(count);
    }
}