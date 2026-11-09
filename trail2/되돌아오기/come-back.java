import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int count = 0;
        int x = 0;
        int y = 0;
        int n = sc.nextInt();
        int[] dx = new int[]{1,-1,0,0};
        int[] dy = new int[]{0,0,-1,1};
        int dir = 0;
        int ox = 0;



        for(int i = 0; i < n; i++){
            char ch = sc.next().charAt(0);
            int num = sc.nextInt();

            if(ch == 'E')
                dir = 0;
            else if(ch == 'W')
                dir = 1;
            else if(ch == 'S')
                dir = 2;
            else 
                dir = 3;

            for(int z = 0; z<num; z++){
                x += dx[dir];
                y += dy[dir];

                if(x == 0 && y == 0){
                    ox = 1;
                    count++;
                    break;
                }
                else 
                    count++;
            }
            if(ox == 1)
                break;
}


            // x += dx[dir] * num;
            // y += dy[dir] * num;
        

        if(ox == 0){
            System.out.print("-1");
        }
        else
            System.out.print(count);
        
    }
}