import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        int C = sc.nextInt();
        int num = 0;
        int min = 0;
        
        for(int i = 0; i<=C; i++) {
            num = i*A;
            if(num <= C){
                if(num > min)  // ③ A만 사용하는 경우
                    min = num;

                for(int j = 0; j<=C; j++) {
                if(num+B <= C){
                    num += B;
                    if(num>min && num <= C)
                        min = num;
                }
                else {
                    break;
                }
            }
            }
            else{
                break;
            }

            
        }

        System.out.print(min);
    }
}