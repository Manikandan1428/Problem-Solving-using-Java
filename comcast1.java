import java.util.Arrays;
import java.util.Scanner;

public class comcast1 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int arr[]={1,2,4,-2,3,7,4};
        int arr1[]=new int[arr.length];
        int a=0;
        int b=-1;
        int sum =0;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]<0 && i>0){
                sum=0;
                for (int j = i-1; j>b; j--) {
                    sum=sum+arr[j];
                }
                
                arr1[a]=sum;
                a++;
                b=i;
            }
        }
        if(b!=arr.length-1){
            sum=0;
            
            for (int j = b+1; j < arr.length; j++) {
                sum=sum+arr[j];
            }
            arr1[a]=sum;
            a++;
        }
        Arrays.sort(arr1);
       System.out.println(arr1[arr1.length-1]);
    }
}
