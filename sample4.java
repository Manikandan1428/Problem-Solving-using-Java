import java.util.Scanner;
public class sample4 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        //System.out.println("enter the string");
        String a = "zzzzz";
        int min=a.length();
        

        int num1=0;
        int num2=0;
        int hcf=1;
        int[] c = new int[a.length()];
        int k=0;
        for (int i = 0; i < a.length(); i++) {
            int count=0;
            for (int j = 0; j < a.length(); j++) {
                
                if(a.charAt(i)==(a.charAt(j))){
                    count++;
                }
            }

            
            c[k] = count;
            k++;

            // System.out.println(a.charAt(i)+"  "+count);

        }
        for (int i = 0; i < c.length; i++) {
            if (i!=c.length-1) {
                
            
                num1=c[i];
                num2=c[i+1];
                while (num1!=num2){
                    
                    if(num1>num2){
                        num1=num1-num2;
                    }
                    else{
                        num2=num2-num1;
                    }
                }
            }    
            
            
        }
System.out.println(num1);
}
}
