import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Stack<Integer> st = new Stack<>();

        
        for(int i = 0; i<n; i++) {
            String s = sc.next();


            if(s.equals("push")){
                int num = sc.nextInt();
                st.push(num);
            }
            else if(s.equals("pop")){
                System.out.println(st.pop());
            }
            else if(s.equals("size")) {
                System.out.println(st.size());

            }
            else if(s.equals("empty")){
                System.out.println(st.empty() ? 1 : 0);
            }
            else {
                System.out.println(st.peek());
            }


            
        }
    }
}