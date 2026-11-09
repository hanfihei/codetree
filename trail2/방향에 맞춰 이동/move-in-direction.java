import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int x = 0;
        int y = 0;


        int[] dx = {0, 0, 1, -1};//북남동서
        int[] dy = {1, -1, 0, 0};
        int dir = 0;

        for (int i = 0; i < n; i++) {
            char di = sc.next().charAt(0);
            int d = sc.nextInt();
            
            if(di == 'N'){ //북
                dir = 0;
            }
            else if(di == 'S'){ // 남
                dir = 1;

            }
            else if(di == 'E'){//남
                dir = 2;
            }
            else { // 서
                dir = 3;
            }

            x += dx[dir] * d;
            y += dy[dir] * d;
            
        }

        System.out.print(x + " " + y);
    }
}