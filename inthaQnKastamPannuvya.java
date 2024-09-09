import java.util.Arrays;
import java.util.Scanner;
import java.math.*;

public class inthaQnKastamPannuvya {
    public static void main(String[] args) {
        int b =0;
        long a= 4294967295l;
        long rem=0;
        int finind=0;
        long []inde=new long[32];
        int index=0;
        long sum=0;
        long [] powval=new long[100];
        while(a!=0){
            rem=a%2;
            inde[index]=rem;
            index++;
            a=a/2;
        }
        for (int i = inde.length-1; i >=0; i--) {
            powval[b]=inde[i];
            b++;
        }

        for (int i = 0; i < b; i++) {
            if(powval[i]==0){
                powval[i]=1;
            }
            else{
                powval[i]=0;
            }
        }
        for (int i = b-1; i >=0; i--) {
            inde[finind]=powval[i];
            finind++;
        }
        
        long mul=1;
        long finsum=0;
        for (int i = 1; i < b; i++) {
            mul=mul*2;
            finsum=finsum+((inde[i])*mul);
        }
        System.out.println(finsum+inde[0]);
    }
}
