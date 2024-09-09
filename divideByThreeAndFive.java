import java.util.Scanner;
public class divideByThreeAndFive {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int count=0;
        int sum=0;
        for (int i = 1; i <= 1000; i++) {
            if(i%3==0 && i%5==0){
                System.out.println("Found number :"+i);
                count++;
                sum=sum+i;
                if(count==5){
                    break;
                }
            }
        }
        System.out.println(sum);
    }
    
    
}
