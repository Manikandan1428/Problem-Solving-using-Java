import java.util.Scanner;
public class evenNumberWhileloop {
   public static void main(String[] args) {
        int i=5;
        int oddcount =0;
        int evencount=0;
        while (i<=20) {
           if(isEvenNumber(i)){
                evencount++;
                System.out.println(i);
                if(evencount==5){
                    break;
                }
            }
            else{
                oddcount++;
            }
            i++; 
        }
        System.out.println("odd count :"+oddcount);
        System.out.println("even count :"+evencount); 
            
    }   
    
   public static boolean isEvenNumber(int num){
            if(num%2==0){
                return true;
            }
            else{
                return false;
            }
        }
}
