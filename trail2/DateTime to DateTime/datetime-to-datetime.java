import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int d = sc.nextInt();
        int h = sc.nextInt();
        int m = sc.nextInt();

        int sum = 11 * 24 * 60 + 11 * 60 + 11;
        int sum2 = d * 24 * 60 + h * 60 + m;

        if(sum2<sum)
            System.out.print("-1");
        else
            System.out.println(sum2 - sum);
    }
}