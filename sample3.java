import java.util.Scanner;

public class sample3 {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        
         int max =0;
        int count =0;
       
        int n = 6;
        int rearr=n;
        int arr[] =  {3,3,4,4,5,5};
        int arr1[]=new int[n];
        for (int i = 0; i < n; i++) {
             arr1[i]=arr[i];
        }
        if(n%2!=0){
            
            for (int i = 0; i < n; i++) {
                if(i!=n-1){
                if(i<(n/2)){
                    if((arr[i+1]-arr[i])!=1){
                        count++;
                    }
                }
                if(i>(n/2)){
                    if((arr[i]-arr[i+1])!=1){
                        count++;
                    }
                }
                if(i==n/2){
                    if(((arr[i])-(arr[i-1])!=1) || (arr[i])-(arr[i+1])!=1 ){
                        count++;
                    }
                }
            }
        }
            
            
            int an = 0;
            

            

            
        
        }
        else{
            for (int i = 0; i < n; i++) {
                
                if(i<((n/2)-1)){
                    if((arr[i+1]-arr[i])!=1){
                        count++;
                    }
                }
                if(i>(n/2)){
                    if((arr[i-1]-arr[i])!=1){
                        count++;
                    }
                }
                if(arr[n/2]!=arr[(n/2)-1]){
                    count++;
                }
                
            }
        }
         System.out.println(count);
        }
       
        
        
        
    }
