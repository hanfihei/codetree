import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[7];
        int max = 0;
        for (int i = 0; i < 7; i++) {
            arr[i] = sc.nextInt();
            if(arr[i]> max){
                max = arr[i];
            }
        }

        Arrays.sort(arr);

        System.out.print(arr[0] + " ");
        System.out.print(arr[1] + " ");
        System.out.print(max-arr[0]-arr[1]);
        
        

        
    }
}