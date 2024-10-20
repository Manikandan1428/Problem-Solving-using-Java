/*
 
From the input sentence given, 
find the strings which are not palindrome and print it.
Input: he knows malayalam
Output: he knows

 */


import java.util.Scanner;
public class zohoPrintNonPalindrome {
    public static void main(String [] args){
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter the string");
        String str=scn.nextLine();
        String temp="";
        String res="";
        for (int j = 0; j < str.length(); j++) {
            if(str.charAt(j)==' '){
                if(!temp.equals("")){
                    int k=temp.length()-1;
                    for (int i = 0; i < temp.length(); i++) {
                        if(temp.charAt(i)==temp.charAt(k)){
                            k--;
                            
                        }
                        else{
                            res=res.concat(temp)+" ";
                            
                        }
                        temp="";
                    }
                }
            }
            else{
                temp+=str.charAt(j);
            }
            
            
        }
        System.out.println(res);
        
        

    }
}
