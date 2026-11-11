import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int count = 0;
        int[] arr = new int[n];
        for(int i = 0; i < n; i++)
            arr[i] = sc.nextInt();

        for(int i = 0; i<n; i++) {
            if(arr[i] == 0)
                continue;

            if(m == 0){
                count++;
            }
            else{
            int num = 2*m +1;
            count++;
            
            i += num-1;
            }
        }

        System.out.print(count);


        
    }
}