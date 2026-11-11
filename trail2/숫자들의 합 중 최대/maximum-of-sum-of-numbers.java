import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
        int sum = 0; 
        int max = Integer.MIN_VALUE;

        for(int i = x; i<=y; i++) {
            sum = 0;
            int n = i;

            while(n>0) {
            int num = n%10;
            sum += num;
            n = n/10;    
        }
        // System.out.println(sum);
        if(max<sum)
            max = sum;

        }

        System.out.print(max);

    }
}