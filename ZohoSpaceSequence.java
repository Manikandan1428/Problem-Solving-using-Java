
// Given an input string and a dictionary of words, find out if the input string can besegmented into a space-separated sequence of dictionary words. See following examplesfor more details.
// Consider the following dictionary{ i, like, sam, sung, samsung, mobile, ice,cream, icecream, man, go, mango}
// Input: ilikeOutput: Yes
// The string can be segmented as "i like".
// Input: ilikesamsungOutput: Yes
// The string can be segmented as "i like samsung"or "i like sam sung".<>











import java.util.Scanner;
public class ZohoSpaceSequence{
    public static void main(String [] args){
        Scanner scn = new Scanner(System.in);
        String arr[]={"i","like", "sam", "sung", "samsung", "mobile", "ice","cream", "icecream", "man", "go", "mango"};
        System.out.println("Enter the string:");
        String inp=scn.nextLine();
        boolean ans=false;
        String temp="";
        for(int i=0;i<inp.length();i++){
            temp+=inp.charAt(i);
            for(String word:arr){
                if(temp.equals(word)){
                    temp="";
                    ans=true;
                    break;
                }
                else{
                    ans=false;
                }
            }
        }
        if(temp.isEmpty() && ans){
            System.out.println("yes");
        }
        else{
            System.out.println("no");
        }

        }
        
    }
