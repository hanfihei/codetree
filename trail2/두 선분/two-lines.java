import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x1 = sc.nextInt();
        int x2 = sc.nextInt();
        int x3 = sc.nextInt();
        int x4 = sc.nextInt();
        
        int ox = 0;
        for(int i = x1; i<=x2; i++ ) {
            for(int j = x3; j<=x4; j++) {
                if(i==j){
                    ox = 1;
                }
            }
        }

        if(ox==1){
            System.out.print("intersecting");
        }
        else    
            System.out.print("nonintersecting");
    }
}