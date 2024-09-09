import java.util.Scanner;
public class natoWord {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("enter the character:");
        char c = scn.next().charAt(0);
        switch (c) {
            case 'a':{
                System.out.println("for "+c+", Able is the NATO word");
                break;
            }
            case 'b':{
                System.out.println("for "+c+", Baker is the NATO word");
                break;
            }
            case 'c':{
                System.out.println("for "+c+", Charlie is the NATO word");
                break;
            }
            case 'd':{
                System.out.println("for "+c+", Dog is the NATO word");
                break;
            }
            case 'e':{
                System.out.println("for "+c+", Easy is the NATO word");
                break;
            }
            default:{
                System.out.println(c+" not found");
                break;
            }
        }

    }
}
