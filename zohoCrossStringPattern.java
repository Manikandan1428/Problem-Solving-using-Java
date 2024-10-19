
import java.util.Scanner;
public class zohoCrossStringPattern {
    public static void main(String [] args){
        Scanner scn = new Scanner(System.in);
        String name=scn.nextLine();
        for (int i = 0; i < name.length(); i++) {
            for (int j = 0; j < name.length(); j++) {
                if(i==j || j==name.length()-i-1){
                    System.out.print(name.charAt(i));
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
