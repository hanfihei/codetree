import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String A = sc.next();
        int count = 0;
        
        for(int i = 0; i< A.length(); i++){
            char ch = A.charAt(i);

            if(ch == '('){
                for(int j = i+1; j<A.length(); j++) {
                    char ch2 = A.charAt(j);
                    if(ch2 == ')'){
                        count++;
                    }
            }
            }
        }
        System.out.print(count);
    }
}