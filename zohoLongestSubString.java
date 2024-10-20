import java.util.Scanner;
public class zohoLongestSubString {
        public int lengthOfLongestSubstring(String s) {
            int j=0;
            int k=1;
            int count1=1;
            int finCount=0;
            String str="";
            for(int i=2;i<s.length()-1;i++){
                if(s.charAt(j)!=s.charAt(k)){
                    count1++;
                    if(s.charAt(i)==s.charAt(j) || s.charAt(i)==s.charAt(k)){
                        j=i;
                        k=i+1;
                        i=i+1;
                        if(finCount<count1){
                        finCount=count1;
                        count1=1;
                        }
                        
    
                    }
                    System.out.println(count1);
                }
                else{
                    if(finCount<count1){
                        finCount=count1;
                        count1=1;
                        
                    }
                }
            }
            return finCount;
        }
        public static void main(String [] args){
            zohoLongestSubString zl = new zohoLongestSubString();
            int n=zl.lengthOfLongestSubstring("pwwkew");
            System.out.println(n);
        }
    }
