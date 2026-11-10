import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int[] arr = new int[100001];
        int hi = 0;

        for (int i = 1; i < n+1; i++) {
            int pos = sc.nextInt();
            char c = sc.next().charAt(0);

            if(hi < pos)
                hi = pos;

            if(c == 'G'){
                arr[pos] += 1;
            }
            else {
                arr[pos] += 2;
            }
        }
        int max = 0;
        

        for(int i = 1; i<=hi; i++){
            int sum = 0;
            for(int j = i; j<i+k+1; j++) {
                sum += arr[j]; 
            }
            if(sum > max)
                max = sum;
        }


            System.out.print(max);
        
    }
}