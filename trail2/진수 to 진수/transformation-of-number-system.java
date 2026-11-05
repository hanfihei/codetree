import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        String N = sc.next();
        int num = Integer.parseInt(N, A);
        N = Integer.toString(num, B);

        for(int i = 0; i<N.length(); i++){
            System.out.print(N.charAt(i));
        }
        
        
        
        
    }
}