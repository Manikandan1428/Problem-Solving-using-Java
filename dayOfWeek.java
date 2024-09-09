import java.util.Scanner;
/**
 * dayOfWeek
 */
public class dayOfWeek {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter the day");
        int day = scn.nextInt();
        printDayOfWeek(day);
        printWeekDay(day);
    }
    public static void printDayOfWeek(int day){
        String nameOfTheWeek="";
        switch(day){
            case 0 -> nameOfTheWeek="Sunday";
            case 1 -> nameOfTheWeek="Monday";
            case 2 -> nameOfTheWeek="Tuesday";
            case 3 -> nameOfTheWeek="Wednesday";
            case 4 -> nameOfTheWeek="Thursday";
            case 5 -> nameOfTheWeek="Friday";
            case 6 -> nameOfTheWeek="Saturday";
            default -> nameOfTheWeek="Invalid Day";
        }
        System.out.println(nameOfTheWeek);
    }
    public static void printWeekDay(int day){
        if(day<7 && day>=0){
            if(day==0){
                System.out.println("Sunday");
            }
            if(day==1){
                System.out.println("Monday");
            }
            if(day==2){
                System.out.println("Tuesday");
            }
            if(day==3){
                System.out.println("Wednesday");
            }
            if(day==4){
                System.out.println("Thursday");
            }
            if(day==5){
                System.out.println("Friday");
            }
            if(day==6){
                System.out.println("Saturday");
            }
        }
        else{
            System.out.println("Invalid Day");
        }
    }
}