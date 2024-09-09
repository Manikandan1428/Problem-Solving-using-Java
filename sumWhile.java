import java.util.Scanner;
public class sumWhile {
    public static void main(String[] args) {
        Scanner scn = new Scanner (System.in);
        System.out.println("enter the number :");
        int num= scn.nextInt();
        System.out.println(sumDigit(num));
    }
    
    public static int sumDigit(int num){
        if(num>0){
            int rem=0;
            while(num!=0){
                rem=rem+num%10;
                num=num/10;
            }
            int sum=rem;
            if(rem>9){
                rem=0;
                while(sum>0){
                    rem+=sum%10;
                    sum=sum/10;
                }
                return rem;
            }
            else{
                return rem;
            }
            
        }
        else{
            return -1;
        }
    }
}
