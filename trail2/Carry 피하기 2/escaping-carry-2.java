import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int max = 0;
        int a = 0;
        int b = 0;
        int c = 0;
    
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        for(int i = 0; i<n; i++) {
            
            for(int j = i+1; j<n; j++) {
                int ox = 1;
                
                for(int z = j+1; z<n; z++) {
                    ox = 1;

                    a = arr[i];
                    b = arr[j];
                    c = arr[z];

                    while(a > 0 || b > 0 || c > 0){
                        int aa = a %10;
                        int bb = b %10;
                        int cc = c %10;

                        if(aa+bb+cc>=10){
                            ox = 0;
                            break;
                        }
                        else{
                            a = a/10;
                            b = b/10;
                            c = c/10;
                        }
                    }
                    if(ox == 1 && arr[i] + arr[j] + arr[z] > max) {
                        max = arr[i] + arr[j] + arr[z];
                    }
                    
                    
                    
                }
            }
        }
        if(max != 0)
            System.out.print(max);
        else   
            System.out.print("-1");
    }
}