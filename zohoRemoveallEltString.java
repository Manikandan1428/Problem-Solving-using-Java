import java.util.Scanner;
public class zohoRemoveallEltString {
    public static void main(String [] args){
        Scanner scn = new Scanner(System.in);
        System.out.println("enter a string");
        String s1=scn.nextLine();
        System.out.println("enter a string to remove from string1");
        String s2=scn.nextLine();
        int size=0;
        char[]ch=new char[s1.length()];
        
        for(int i=0;i<s1.length();i++){
            int count=0;
            for (int j = 0; j < s2.length(); j++) {
                if(s1.charAt(i)!=s2.charAt(j)){
                    count++;
                }
                
            }
            if(count==s2.length()){
                ch[size]=s1.charAt(i);
                size++;
            }
        }
        for (int i = 0; i < size; i++) {
            System.out.print(ch[i]);
        }

    }
    
}