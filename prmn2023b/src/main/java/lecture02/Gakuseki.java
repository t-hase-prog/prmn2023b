package lecture02;

public class Gakuseki {
    String gakuseki;
    String number;
    void hantei(){
        boolean complete = (number.equals(gakuseki));
        if(complete){
            System.out.println("complete!!");
        }else{
            System.out.println("error!!");
        }
    }
}
