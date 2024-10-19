/*
 * print the following pattern
   1
  32
 654
10987
10987
 654
  32
   1
 */


import java.util.Scanner;
public class zohoDiamondPattern {
   public static void main(String [] args){
        Scanner scn = new Scanner(System.in);
        
        int num=0;
        int temp=0;
        for(int i=1;i<=4;i++){
            int count=1;
            num=temp+i;
            temp=num;
           for(int j=1;j<=4;j++){
                if(count<=(4-i)){
                    System.out.print(" ");
                    count++;
                }
                else{
                    System.out.print(num);
                    num--;
                    count++;
                }
           }
           System.out.println();
            
        }
        temp+=5;
        for(int i=4;i>0;i--){
            int count=1;
            num=temp-i-1;
            temp=num;
           for(int j=1;j<=4;j++){
                if(count<=(4-i)){
                    System.out.print(" ");
                    count++;
                }
                else{
                    System.out.print(num);
                    num--;
                    count++;
                }
           }
           System.out.println();
            
        }
   } 
}
