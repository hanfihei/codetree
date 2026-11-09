import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        char[] arr = new char[a.length()];
        String b = "";

        int max = Integer.parseInt(a, 2);
        

        for(int i = 0; i<a.length(); i++){
            arr[i] = a.charAt(i);
        }
        
        for(int i = 0; i<arr.length; i++){
            char ch = arr[i];
            if(ch == '0'){
                arr[i] = '1';
                break;
            }
            else if(i == arr.length-1){
                arr[i] = '0';
            }
        }
        for(int i = 0; i<arr.length; i++){
            b += arr[i];
        }

        int num = Integer.parseInt(b, 2);
        // if(num>1){
            System.out.print(num);
        // }
        
        // else if(num<max){
        //     System.out.print(max);
        // }
    }
}