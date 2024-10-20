/*
 
Two strings of equal length will be given.
 Print all the adjacent pairs which are notequal.
 Input: asdfghij and adsfgijh
 Output: sd-ds, hij-ijh

 */




import java.util.Scanner;
public class zohoAdjacentNotEqualStringPair {
    public static void main(String [] args){
        Scanner scn = new Scanner(System.in);
        String str1="asdfghij";
        String str2="adsfgijh";
        String res1="";
        String res2="";
        for (int i = 0; i < str1.length(); i++) {
            if(str1.charAt(i)!=str2.charAt(i)){
                res1=res1+str1.charAt(i);
                res2=res2+str2.charAt(i);
            }
            else{
                if(!res1.equals("")){
                    System.out.println(res1+"-"+res2);
                    res1="";
                    res2="";
                }
            }
        }
        if(!res1.equals("")){
            System.out.println(res1+"-"+res2);
        }
    }
}
