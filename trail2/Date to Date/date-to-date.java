import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int m1 = sc.nextInt();
        int d1 = sc.nextInt();
        int m2 = sc.nextInt();
        int d2 = sc.nextInt();

        int sum = 0;

        for (int m = m1; m <= m2; m++) {
            int days = 0;

            if (m == 2)
                days = 28;
            else if (m == 4 || m == 6 || m == 9 || m == 11)
                days = 30;
            else
                days = 31;

            if (m == m1 && m == m2)
                sum += d2 - d1 + 1;
            else if (m == m1)
                sum += days - d1 + 1;
            else if (m == m2)
                sum += d2;
            else
                sum += days;
        }

        System.out.println(sum);
    }
}