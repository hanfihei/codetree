import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int count = 0;
        String ch = "ab";
        int aa = 0;
        int bb = 0;
        for (int i = 0; i < n; i++) {
            char c = sc.next().charAt(0);
            int s = sc.nextInt();

            if(c == 'A'){
                aa += s;
            }
            else {
                bb += s;
            }
            if(aa==bb){
                if(!ch.equals("ab")){
                    count++;
                    ch = "ab";
                }
            }
            else if(aa>bb){
                if(!ch.equals("a")){
                    count++;
                    ch = "a";
                }
            }
            else{
                if(!ch.equals("b")){
                    count++;
                    ch = "b";
                }

            }
        }

        System.out.print(count);
        
    }
}