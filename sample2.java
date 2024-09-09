import java.util.Scanner;
public class sample2 {
   public static void main(String[] args) {
    Scanner scn = new Scanner(System.in);
    System.out.println("enter the no of elements:");
    int n = scn.nextInt();
    int l[]=new int[n];
    
    System.out.println("enter the elements:");
    for (int i = 0; i < n; i++) {
        l[i] = scn.nextInt();
    }

    int temp=0;
    int d=0;
    for (int i = 0; i < n; i++) {
        if (i!=n-1) {
           if(l[i]<=l[i+1]){
                i=i+1;
                temp=(2*i)-1;
                i--; //0
                while((l[i+1]>l[i]) && (temp>0) ){
                    l[i+1]=l[i+1]-1;
                    temp--; //0
                }
                d++;
            }
        }

    }
    System.out.println(d);
    }
}
