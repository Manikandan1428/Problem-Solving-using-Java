/*


Given an array as input, The condition is if the number is repeated you must add thenumber and put the next index value to 0. 
If the number is 0 print it at the last.
Eg: arr[] = { 0, 2, 2, 2, 0, 6, 6, 0, 8}
Output: 4 2 12 8 0 0 0 0 0 .


 */









import java.util.Scanner;
public class addRepatedEltArray {
    public static void main(String [] args){
        Scanner scn = new Scanner(System.in);
        int arr []={ 0, 2, 2, 2, 0, 6, 6, 0, 8};
        for(int i=0;i<arr.length;i++){
            if(i<arr.length-1){
                if(arr[i]==arr[i+1]){
                    arr[i]=arr[i]*2;
                    arr[i+1]=0;
                }
            }
        }
        int j=0;
        for (int i = 0; i < arr.length; i++) {
            
            if(arr[i]==0){
                continue;
            }
            if(arr[i]>0){
                arr[j]=arr[i];
                j++;
            }
        }
        for (int i = 0; i < arr.length; i++) {
           if(i>=j){
            arr[i]=0;
           }
           System.out.println(arr[i]);
        }
    }
}
