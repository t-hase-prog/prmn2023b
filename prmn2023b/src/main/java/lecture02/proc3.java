package lecture02;
import java.util.Scanner;
public class proc3 {
    public static void main(String[] args) {
        GakuPw gp = new GakuPw();
        gp.inputgs();
        System.out.print("学籍番号を入力してください：");
        Scanner scan = new Scanner(System.in);
        String gakuseki = scan.next();
        int idx=gp.inputpw(gakuseki);
        System.out.print("パスワードを入力してください：");
        String pass = scan.next();
        gp.login(pass,idx);
    }
}
