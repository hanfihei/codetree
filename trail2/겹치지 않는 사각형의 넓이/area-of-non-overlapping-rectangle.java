import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int ax1 = sc.nextInt();
        int ay1 = sc.nextInt();
        int ax2 = sc.nextInt();
        int ay2 = sc.nextInt();
        int bx1 = sc.nextInt();
        int by1 = sc.nextInt();
        int bx2 = sc.nextInt();
        int by2 = sc.nextInt();
        int mx1 = sc.nextInt();
        int my1 = sc.nextInt();
        int mx2 = sc.nextInt();
        int my2 = sc.nextInt();
        int[][] arrA = new int[2001][2001];
        int[][] arrB = new int[2001][2001];

    
        for(int i = ax1; i<ax2; i++){
            for(int j = ay1; j<ay2; j++) {
                arrA[i+1000][j+1000] = 1;
            }
        }

        for(int i = bx1; i<bx2; i++){
            for(int j = by1; j<by2; j++) {
                arrB[i+1000][j+1000] = 1;
            }
        }


        for(int i = mx1; i<mx2; i++){
            for(int j = my1; j<my2; j++) {
                arrA[i+1000][j+1000] = 0;
                arrB[i+1000][j+1000] = 0;
            }
        }

        int count = 0;

        for(int i = 0; i<arrA.length; i++){
            for(int j = 0; j<arrA[0].length; j++){
                if(arrA[i][j] == 1)
                    count++;
            }
        }

        for(int i = 0; i<arrB.length; i++){
            for(int j = 0; j<arrB[0].length; j++){
                if(arrB[i][j] == 1)
                    count++;
            }
        }
        System.out.print(count);
        

    }
}