import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int count = 0;
        int[] arr = new int[n+1];
        arr[0] = -2233;
        int max = 0; 
        for (int i = 1; i < n+1; i++){
            arr[i] = sc.nextInt();
            if(i != 1 && arr[i]<0 && arr[i-1]<0){
                count++;
                if(count > max)
                    max = count;
            }
            else if(i != 1 && arr[i]>=0 && arr[i-1]>=0) {
                count++;
                if(count > max)
                    max = count;
            }
            else
                count = 0;
        }
        
        System.out.print(max+1);
    }
    
}