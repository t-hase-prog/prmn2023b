package lecture02;
import java.util.Scanner;
public class proc1 {
    public static void main(String[] args) {
        String number = "b2221840";
        Scanner scan = new Scanner(System.in);
        System.out.print("学籍番号を入力してください:");
        String gakuseki = scan.next();

        Gakuseki eq = new Gakuseki();
        eq.number = number;
        eq.gakuseki = gakuseki;
        eq.hantei();
    }
}
