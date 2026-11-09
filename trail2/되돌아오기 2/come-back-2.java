import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String commands = sc.next();
        int[] dx = new int[]{1,-1,0,0};
        int[] dy = new int[]{0,0,-1,1};
        int x = 0;
        int y = 0;
        int dir = 3;
        int ox = 0;
        int count = 0;
        
        for(int i = 0; i<commands.length(); i++){
            char ch = commands.charAt(i);

            if(ch == 'R'){
                if(dir == 0){
                    dir = 2;
                }
                else if(dir == 1){
                    dir = 3;
                }
                else if(dir == 2){
                    dir = 1;
                }
                else {
                    dir = 0;
                }
                count++;
            }
            else if(ch == 'L'){
                if(dir == 0){
                    dir = 3;
                }
                else if(dir == 1){
                    dir = 2;
                }
                else if(dir == 2){
                    dir = 0;
                }
                else {
                    dir = 1;
                }
                count++;

            }
            else {
                x += dx[dir];
                y += dy[dir];
                count++;
                
                if(x==0 && y==0){
                    ox = 1;
                    break;
                }
            }
        }

        if(ox == 0)
            System.out.print("-1");
        else
            System.out.print(count);

        
    }
}