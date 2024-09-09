
import java.util.Scanner;;
/**
 * sample
 */
public class sample {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter the energy E");
        int E = scn.nextInt();
        System.out.println("Enter the number of workouts");
        int N = scn.nextInt();
        System.out.println("Enter the Draining");
        int A[]= new int[N];
        int temp=0;
        int count=0;
        for (int i = 0; i < N; i++) {
            A[i] = scn.nextInt();
        }
        
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                if (A[i]>A[j]){
                    temp=A[i];
                    A[i]=A[j];
                    A[j]=temp;
                }
            }
            
        }
        for (int i = 0; i < N; i++) {
            if(E>=A[i]){
                E=E-A[i];
                count++;
                if(E>=A[i]){
                    E=E-A[i];
                    count++;
                }
            }
        }
        if(E==0){
            System.out.println(count);
        }
        else{
            System.out.println("-1");
        }
        
        
         scn.close();
    }
}
   
