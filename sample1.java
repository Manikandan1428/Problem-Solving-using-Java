import java.util.Scanner;
public class sample1 {
    public static void main(String[] args) {
        Scanner scn = new Scanner (System.in);
        System.out.println("Enter the number of heroes");
        int m = scn.nextInt();
        System.out.println("enter the no of villains");
        int n = scn.nextInt();
        System.out.println("enter thr power of heros");
        int h = scn.nextInt();
        System.out.println("enter the villain power");
        int vil[]=new int[n];
        int vilcount=0;
        int save = h;
        int tempm=m;
      
        for (int i = 0; i < n; i++) {
            vil[i]=scn.nextInt();
        }
        for (int i = 0; i < n; i++) {
            if(tempm==0){
                System.out.println(n-vilcount);
                break;
            }
            else{
                if(vil[i]<=h){
                    h=h-vil[i];
                    vilcount++;
                    if(i!=n-1){
                        i++;
                        if(h<vil[i]){
                            h=save;
                            tempm--;
                        }
                        i--;
                    }
                }
                else{
                    if(h<vil[i]){
                        h=save;
                        tempm--;
                        
                    }
                }
           
            }
            if(vilcount-n==0){
                System.out.println("0");
            }

        }
    
}
            
        
    }

