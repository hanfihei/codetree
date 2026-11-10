import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int count = 0;
        
        for(int i = 1; i<n+1; i++) {
            int ox = 0;
            for(int j = 1; j<n+1; j++) {
                for(int z = 1; z<n+1; z++) {
                    int aa = i-a;
                    int bb = j-b;
                    int cc = z-c;

                    if(Math.abs(aa) <= 2 || Math.abs(bb) <= 2 || Math.abs(cc) <=2) {
                        count++;
                    }
                }
          
            }

        }


        System.out.print(count);
    }
}