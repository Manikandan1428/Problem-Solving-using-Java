import java.util.Scanner;
public class primeNumberCountFor {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("enter the min val");
        int minval=scn.nextInt();
        System.out.println("enter the max value");
        int maxval=scn.nextInt();
        isPrimeNumber(minval, maxval);
        
        

    }
    public static void isPrimeNumber(int minval,int maxval){
        
        int primeCount=0;
        if(maxval<=1000 && minval>=2){
            for (int i = minval; i <= maxval; i++) {
                int count=0;
                for (int j = 2; j <= i/2; j++) {
                    if(i%j==0){
                        count++;
                    }
                }
                
                    if(count==0){
                        System.out.println(i);
                        primeCount++;
                    }
                    if(primeCount==3){
                    break;
                    }
            }
                
            
            
        }
        else{
            System.out.println("enter value in range");
        }
    }
}