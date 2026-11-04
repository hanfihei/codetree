import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList<Integer> list = new ArrayList<>();
        if(n==0)
            System.out.print("0");

        while(n>0){
            int bn = n % 2;
            n = n/2;
            list.add(bn);
        }
        Collections.reverse(list);

        

            for (int i = 0; i < list.size(); i++) 
                System.out.print(list.get(i));
        
    }
}