import java.util.Scanner;
/**
 * comcast2
 */
public class comcast2 {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int []mar={84,57,38,29};
        int [] rearr=new int[mar.length];
        int a=0;
        int upd=0;
        for (int i = 0; i < mar.length; i++) {
            if(mar[i]>37 && ((mar[i])%5)>=3){
                upd=mar[i]+(5-(mar[i]%5));
            }
            else{
                upd=mar[i];
            }
            rearr[a]=upd;
            a++;
        }
        for (int i = 0; i < rearr.length; i++) {
            System.out.println(rearr[i]);
        }   
        

    }
}