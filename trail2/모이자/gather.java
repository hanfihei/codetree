import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        int[] num = new int[n];
        
        
        for(int i = 0; i<n; i++) {
            a[i] = sc.nextInt();
        }

        for(int i = 0; i<n; i++){
            int sum = 1;
            for(int j = 0; j<n; j++){
                if(i<j){
                    sum += a[j]*(j-i);
                }
                else if(i==j){
                    sum += 0;
                }
                else{
                    sum += a[j]*(i-j);
                }
            }
            num[i] = --sum;

        }

        Arrays.sort(num);

        System.out.print(num[0]);
        
    }
}