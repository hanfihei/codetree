import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int count = 0;
        int[] arr = new int[n];
        for (int i = 0; i < n; i++)
            arr[i] = sc.nextInt();

        int j = 0;

        for(int i = 0; i<n; i++){
            
            for(j = i; j<n; j++){
                float sum = 0;
                for(int z = i; z<=j; z++) {
                    sum += arr[z];
                }
                float avg = sum/(j-i+1);
                for(int k = i; k<=j; k++){
                    if(arr[k] == avg){
                        count++;
                        break;
                    }
                }
            }
        }
        System.out.print(count);
        
    }
}