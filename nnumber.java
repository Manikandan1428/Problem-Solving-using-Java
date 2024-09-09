import java.util.Scanner;
public class nnumber {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        
        for(int i=n;i>0;i--){
            int cou=0;
            int a=n;
            for(int j=0;j<(i*n);j++){
                cou++;
                if(cou>i){
                    a--;
                    cou=0;
                    j--;
                }
                else{
                    System.out.print(a);
                }
                
    
                
            }
            System.out.println();
        }
    }
}
