import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int x = 0;
        int y = 0;
        int[] dx = new int[]{-1,1,0,0}; //북남동서
        int[] dy =  new int[]{0,0,1,-1};

        for (int i = 0; i < n; i++) {
            char di = sc.next().charAt(0);
            int d = sc.nextInt();
            
            if(di == 'N'){ //북
                y += dy[0] + d;
            }
            else if(di == 'E'){ // 동
                x += dx[2] + d;

            }
            else if(di == 'S'){//남
                y += dy[1] - d;
            }
            else { // 서
                x += dx[3] - d;
            }
            
        }

        System.out.print(x + " " + y);
    }
}