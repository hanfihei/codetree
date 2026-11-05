import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] x1 = new int[101];
        int m = 0;

        for (int i = 0; i < n; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            if(a<=b && m < b)
                m = b;
            else if(a>=b && m<a)
                m = a;
            for(int j = a; j<=b; j++){
                x1[j]++;
                
            }
        }

        int max = 0;
        for(int i = 1; i<=m; i++){
            if(x1[i]> max){
                max = x1[i];
            }
        }
        System.out.print(max);        
    }
}