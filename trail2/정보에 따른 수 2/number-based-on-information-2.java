import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        int a = sc.nextInt();
        int b = sc.nextInt();
        String[][] cc = new String[T][2];
        int count = 0;

        for (int i = 0; i < T; i++) {
            cc[i][0] = sc.next();
            cc[i][1] = sc.next();
        }
        for(int i = a; i<=b; i++){
            int a1 = Integer.MAX_VALUE;
            int a2 = Integer.MAX_VALUE;

            for(int j = 0; j<T; j++) {

                if(cc[j][0].equals("S")){
                    int num = Integer.parseInt(cc[j][1]);
                    int dist = Math.abs(i - num);
                    if(dist < a1)
                        a1 = dist;
                }
                else{
                    int num = Integer.parseInt(cc[j][1]);
                    int dist = Math.abs(i - num);
                    if(dist < a2)
                        a2 = dist;               
                }
                
                

            }
            if(a1 <= a2){
                    count++;
                }
            
        }
        System.out.print(count);
    }
}
