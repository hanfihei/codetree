import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String str = sc.next();
        int count = 0;
        
        for(int i = 0; i<n; i++){
            char ch = str.charAt(i);
            if(ch == 'C'){
                for(int j = i+1; j<n; j++) {
                    char ch2 = str.charAt(j);
                    if(ch2 == 'O'){
                        for(int z = j+1; z<n; z++){
                            char ch3 = str.charAt(z);
                            if(ch3 == 'W'){
                                count++;
                            }
                        }
                    }
                }
            }
        }
        System.out.print(count);
    }
}