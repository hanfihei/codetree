import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String A = sc.next();
        int count = 0;
        
        for(int i = 0; i<A.length()-1; i++) {
            char ch = A.charAt(i);
            char ch2 = A.charAt(i+1);

            if(ch == '(' && ch2 == '('){
                for(int j = i+2; j<A.length()-1; j++) {
                    char chch = A.charAt(j);
                    char chch2 = A.charAt(j+1);

                    if(chch == ')' && chch2 == ')'){
                        count++;
                    }
                }
            }

        }
        System.out.print(count);
    }
}