import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Queue<Integer> q = new ArrayDeque<>();

        for(int i = 0; i<n; i++) {
            String s = sc.next();

            if(s.equals("push")){
                int num = sc.nextInt();
                q.offer(num);
            }
            else if(s.equals("pop")){
                System.out.println(q.poll());
            }
            else if(s.equals("size")){
                System.out.println(q.size());
            }
            else if(s.equals("empty")){
                System.out.println(q.isEmpty() ? 1 : 0);
            }
            else {
                System.out.println(q.peek());
            }
        }
        
    }
}