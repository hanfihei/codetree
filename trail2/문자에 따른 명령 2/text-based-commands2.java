import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        int x = 0;
        int y = 0;
        int dir = 3; //동서남북
        int[] dx = new int[]{1,-1,0,0};
        int[] dy = new int[]{0,0,-1,1};
        
        for(int i = 0; i<s.length(); i++){
            char ch = s.charAt(i);

            if(ch == 'L'){
                if(dir == 0){
                    dir = 3;
                }
                else if(dir == 1){
                    dir = 2;
                }
                else if(dir == 2){
                    dir = 0;
                }
                else if(dir == 3){
                    dir = 1;
                }
            }

            else if(ch == 'R'){
                if(dir == 0){
                    dir = 2;
                }
                else if(dir == 1){
                    dir = 3;
                }
                else if(dir == 2){
                    dir = 1;
                }
                else if(dir == 3){
                    dir = 0;
                }
            }

            

            else{
                if(dir == 0){
                    x++;
                }
                else if(dir == 1){
                    x--;
                }
                else if(dir == 2){
                    y--;
                }
                else {
                    y++;
                }
            }
        }

        System.out.print(x + " " +y);
    }
}