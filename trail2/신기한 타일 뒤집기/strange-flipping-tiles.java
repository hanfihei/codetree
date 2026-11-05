import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int wi = 0;
        int bl = 0;
        int now = 0;
        int[] arr = new int[200001]; 
        int j;
        for (int i = 0; i < n; i++) {
            int x = sc.nextInt();
            char d = sc.next().charAt(0);

            if(d == 'R'){
                for(j = now; j<x+now; j++) {
                    arr[j+100000] = 2;
                }
                now += x-1;
            }
            else{
                for(j = now; j>now-x; j--){
                    arr[j+100000] = 1;
                }
                now -= x-1;
            }
        }

        for(int i = 0; i<arr.length; i++){
            if(arr[i] == 1)
                wi++;
            else if(arr[i] == 2)
                bl++;
        }
        System.out.print(wi + " " + bl);
        
        
    }
}