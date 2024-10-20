/*
 Two sorted arrays will be given. 
 Create an array consisting of the elements of two arrayswith duplicate elements removed in sorted order.
 Note: Use only one loop. No sorting
 */




import java.util.Scanner;
public class zohoRemoveduplicatesArray {
    public static void main(String [] args){
        Scanner scn = new Scanner(System.in);
        int [] arr1={2,8,14,16,25,35,42};
        int [] arr2={3,9,15,18,40,60,90};
        int [] arr3=new int[14];
        int ind=0;
        int j=0;
        for (int i = 0; i < arr1.length; i++) {
            
                if(arr1[i]<arr2[j]){
                    arr3[ind]=arr1[i];
                    ind++;
                }
                else{
                    arr3[ind]=arr2[j];
                    ind++;
                    j++;
                    if(arr2[j]<arr1[i]){
                        arr3[ind]=arr2[j];
                        j++;
                    }
                    else{
                        arr3[ind]=arr1[i];
                        ind++;
                    }
                }
            }
            int a=arr3.length-1;
            if(j!=arr1.length-1){
                for(int i=arr2.length-1;i>=j;i--){
                    arr3[a]=arr2[i];
                    a--;
                }
            }
            
            
        
        // if(arr1[arr1.length-1]<arr2[arr2.length-1]){
        //     arr3[ind-1]=arr2[arr2.length-1];
        // }
        // else{
        //     arr3[ind-1]=arr1[arr1.length-1];
        // }
        for (int i = 0; i < arr3.length; i++) {
            System.out.print(arr3[i]+" ");
        }
    }
}
