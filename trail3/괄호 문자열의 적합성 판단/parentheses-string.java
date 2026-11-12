import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        int ox = 1;
        
        Stack<Character> st = new Stack<>();

        for(int i = 0; i<str.length(); i++) {
            char ch = str.charAt(i);
            
            if(ch == '('){
                st.push(ch);
            }
            else {
                if(st.empty() == true){
                    ox = 0;
                    break;
                }
                else {
                    st.pop();
                }
            }
        }
        if(ox == 1 && st.empty() == true)
            System.out.print("Yes");
        else 
            System.out.print("No");
    }
}