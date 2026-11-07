import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int count = 0;
        int max = 0;
        int[] arr = new int[n+1];
        for (int i = 1; i < n+1; i++) {
            arr[i] = sc.nextInt();
            if(i != 1 && arr[i]> arr[i-1]){
                count++;
                if(max<count)
                    max = count;
            }
            else
                count = 0;
            
        }

        System.out.print(max+1);
        
    }
}