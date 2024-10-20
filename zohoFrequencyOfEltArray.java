/*
 
Find the frequency of all numbers in an array.
Note: use dynamic memory allocation.
For example, if the input is {1, 2, 45, 67, 1, 88}, 
do not calculate the frequency of allelements from 1 to 88

 */



import java.util.ArrayList;
import java.util.Scanner;
public class zohoFrequencyOfEltArray {
    public static void main(String [] args){
        Scanner scn=new Scanner(System.in);
        System.out.println("Enter the number of elts");
        int n=scn.nextInt();
        System.out.println("Enter the"+n+" elements");
        int arr[]=new int[n];
        for (int i = 0; i < n; i++) {
            arr[i]=scn.nextInt();
        }

        ArrayList<Integer> numbers =new ArrayList<>();
        ArrayList<Integer> freq=new ArrayList<>();

        for(int i=0;i<n;i++){
            int num=arr[i];

            int index=numbers.indexOf(num);
            if(index==-1){
                numbers.add(num);
                freq.add(1);
            }
            else{
                freq.set(index,freq.get(index)+1);
            }
        }
        for (int i = 0; i < numbers.size(); i++) {
            System.out.println(numbers.get(i)+"-"+freq.get(i));
        }
    }
}
