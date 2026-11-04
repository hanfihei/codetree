import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int b = sc.nextInt();
        StringBuilder sb = new StringBuilder();
        while(n>0) {
            int num = n%b;
            n = n/b;
            sb.append(num);
        }
        sb.reverse();
        System.out.print(sb);
    }
}