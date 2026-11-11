import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
        int count = 0;
        int result = 0;
        int arr[] = new int[10000];
        
        for(int i = x; i<=y; i++) {
            int n = i;
            count = 0;
            int ox = 1;
            while(n>0){
                int num = n%10;
                arr[count++] = num;
                n = n/10;
            }
            int a = count;
            for(int j = 0; j<count/2; j++) {
                if(arr[j] != arr[--a]){
                    ox = 0;
                    break;
                }
            }
            if(ox == 1)
                result++;
        }
        System.out.print(result);
    }
}