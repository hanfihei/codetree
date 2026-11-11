import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr1 = new int[4];
        int[] arr2 = new int[4];
        int a = 0;
        int b = 0;

        for(int i = 0; i<8; i++) {
            if(i%2 == 0){
                arr1[a++] = sc.nextInt();
            }
            else{
                arr2[b++] = sc.nextInt();
            }
        }
        
        Arrays.sort(arr1);
        Arrays.sort(arr2);

        System.out.print((arr1[3] - arr1[0]) * (arr2[3] - arr2[0]));
        
    }
}