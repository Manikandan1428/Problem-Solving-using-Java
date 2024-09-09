import java.util.Scanner;
public class interestCalculatorFor {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int amount=100;
        calculateInterest();
    }
    public static void calculateInterest(){
        for (double i = 7.5; i <=10; i=i+0.25) {
            System.out.println(100*(i/100));
        }
    }
}
