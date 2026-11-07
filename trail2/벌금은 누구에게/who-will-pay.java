import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); // 학생 수
        int m = sc.nextInt(); // 벌금 횟수
        int k = sc.nextInt(); // k번 이상의 벌칙
        int[] arr = new int[m+1];
        int number = 0;
        int ox = 1;

        for (int i = 0; i < m; i++) {
            int num = sc.nextInt();
            arr[num]++;
            if(arr[num]==k && ox == 1){
                number = num;
                ox = 0;
            }


        }
        if(ox ==1){
            System.out.print("-1");
        }
        else
            System.out.print(number);
        
    }
}