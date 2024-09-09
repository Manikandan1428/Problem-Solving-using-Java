import java.util.Scanner;
public class samp {
   public static void main(String[] args) {
      Scanner scn = new Scanner(System.in);
       int num=scn.nextInt();
       int size = fact(num);
       int [] ans = new int[size];
       int index=0;
       int start=2;
       while(index<size){
         
         int count=0;
         for(int i=2;i<=start;i++){
            if(start%i==0){
               count++;
            }
         }
         if(count==1){
            ans[index]=start;
            index++;
         }
         start++;
         
       }
      //  for (int i = 0; i < ans.length; i++) {
      //    System.out.println(ans[i]);
      //  }
       for (int i = 0; i < num; i++) {
         int ind=num-1;
         int f=0;
         int summ=i+ind;
         int a=0;
         
         for (int j = 0; j<=i; j++) {
            if(j==0){
            System.out.print(ans[j+i]+" ");
            }
            else if(j==1){
               a=summ+f;
               System.out.print(ans[a]+" ");
               f=ind-1;
            }
            else{
               a=a+f;
               System.out.print(ans[a]+" ");
               f=f-1;
            }
            
         }
         System.out.println();
       }

   } 
   public static int fact(int a){
      int sum=0;
      for(int i=1;i<=a;i++){
         sum=sum+i;
      }
      return sum;
   }
}
