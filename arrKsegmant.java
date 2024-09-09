import java.util.Scanner;
public class arrKsegmant {
   public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("enter the number of elements");
        int n = scn.nextInt();
        System.out.println("enter the no of consecutive segmets");
        int k = scn.nextInt();
        System.out.println("enter the elements");
        int a[]=new int[n];
        for (int i = 0; i < n; i++) {
            a[i]=scn.nextInt();
        }
        int cost[]=new int[n];
        int ld = 0;
        int zd=0;
        
          
        int inde=0;
        int arr[][]=new int[ld][zd];
        for (int i = 0; i < arr.length; i++) {
          
        }
        int start=0;
        int end=0;
        int sum=0;
        if (k==1){
            for (int i = 0; i < n; i++) {
                
               
                for (int j = i; j < n; j++) {
                    if(a[i]==a[j]){
                        start=;

                        
                        
                    }
                    
                    
                }
                cost[inde]=end-start;
                inde++;
            }
            
            for (int i = 0; i < cost.length; i++) {
                sum=sum+cost[i];
            }
        }
        System.out.println("cost is "+sum );
   } 
}
