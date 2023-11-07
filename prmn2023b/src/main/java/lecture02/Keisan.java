package lecture02;
import java.util.Scanner;
public class Keisan {
    int[] num= new int[5];
    int x=0;
    Scanner scan =new Scanner(System.in);
    int add(){
        for(int i=0;i<5;i++){
            System.out.print(i+"番目の整数:");
            num[i]=scan.nextInt();
            System.out.println();
            x+=num[i];
        }
        System.out.println("合計値:"+x);
        return x;
    }

    void judgement(int x){
        if(x>=100){
            System.out.println("great!!");
        }else if(x>=50){
            System.out.println("big");
        }else{
            System.out.println("small");
        }
    }
}
