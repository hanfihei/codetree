import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        S[] s = new S[n];

        for (int i = 0; i < n; i++) {
            s[i] = new S();

            s[i].name = sc.next();
            s[i].score1 = sc.nextInt();
            s[i].score2 = sc.nextInt();
            s[i].score3 = sc.nextInt();
            s[i].sum = s[i].score1 + s[i].score2 + s[i].score3;
        }
        Arrays.sort(s, (a,b) -> a.sum - b.sum);
        for(int i = 0 ; i<n; i++) {
            System.out.println(s[i].name + " " + s[i].score1 + " " + s[i].score2 + " " + s[i].score3 + " ");
        }
        
    }
}
class S{
    String name;
    int score1;
    int score2;
    int score3;
    int sum;
}