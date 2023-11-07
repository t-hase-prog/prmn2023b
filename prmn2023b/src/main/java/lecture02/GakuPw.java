package lecture02;

import java.util.Scanner;

public class GakuPw {
    String[][] matrix = new String[5][2];
    Scanner scan = new Scanner(System.in);
    void inputgs() {
        for (int i = 0; i < 5; i++) {
            System.out.print((i+1)+"人目の学籍番号:");
            matrix[i][0] = scan.next();
        }
    }

    int inputpw(String number){
        int numidx=0;
        for(int i=0;i<5;i++) {
            boolean idxmatch = (matrix[i][0].equals(number));
            if (idxmatch) {
                numidx = i;
                System.out.print((i+1)+"人目のパスワード:");
                matrix[i][1]= scan.next();
            }
        }

        boolean match = (matrix[numidx][0].equals(number));
        if (!match) {
            System.out.println("error!!");
            System.exit(0);
        }
        return numidx;
    }

    void login(String pw,int numidx){
            boolean match = (matrix[numidx][1].equals(pw));
            if (match) {
                System.out.println("ログイン完了");
            }else {
                System.out.println("不正なアクセス");
                System.exit(0);
            }
    }
}
