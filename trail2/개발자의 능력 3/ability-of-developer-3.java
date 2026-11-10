import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] a = new int[6];
        int min = 999999;
        int sum1 = 0;
        for (int i = 0; i < 6; i++) {
            a[i] = sc.nextInt();
            sum1  += a[i];
        }
        for(int i = 0; i<6; i++) {
            for(int j = i+1; j<6; j++) {
                for(int z = j+1; z<6; z++) {
                    int sumA = a[i] + a[j] + a[z];
                    int sumB = sum1-sumA;
                    int num = sumA - sumB;
                    num = Math.abs(num);

                    if(num<min){
                        min = num;
                    }
                    
                }
            }
        }
        System.out.print(min);
    }
}