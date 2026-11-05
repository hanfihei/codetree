import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] arr = new int[2001];
        int now = 0;
        int count = 0;
        int j = 0;

        for (int i = 0; i < N; i++) {
            int x = sc.nextInt();
            char dir = sc.next().charAt(0);
            if(dir == 'R'){
                for(j = now; j<x+now; j++)
                    arr[j+1000]++;
                
                now += x;
            }
            
            else{
                for(j = now - 1; j>=now-x; j--)
                    arr[j+1000]++;

                now -= x;
            }
        }
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] >1) 
                count++;
        }

        System.out.print(count);
    }
}