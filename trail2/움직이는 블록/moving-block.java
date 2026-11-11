import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int num = 0;
        int avg = 0;
        int count = 0;
        int[] blocks = new int[n];
        for (int i = 0; i < n; i++) {
            blocks[i] = sc.nextInt();
            avg += blocks[i];
        }
        avg /= n;
        for(int i = 0; i<n; i++) {
            if(blocks[i] != avg) {
                if(avg>blocks[i]){
                    num = avg-blocks[i];
                    count += num;
                }
                // else{
                //     num = blocks[i] -avg;
                //     count += num;
                // }
            }
        }

        System.out.print(count);


        
    }
}