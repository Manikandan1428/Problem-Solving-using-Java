import java.util.Scanner;
public class minSecToHr {
    public static void main(String[] args) {
       
        String g = getDurationString(4000,48);
        //String r = getDurationString(58,);
        System.out.println(g);
        //System.out.println(r);


    }
    public static String getDurationString(int seconds){
     if (seconds>=0) {
        
     
        int minutes=seconds/60;
        seconds=seconds%60;
        int hr=minutes/60;
        minutes=minutes%60;
        
        String s = (hr+"h "+minutes+"m "+seconds+"s");
        return s;
        }
    
    else{
       return "Enter a valid string";
    } 
} 
            
        
    
    public static String getDurationString(int minutes,int seconds) {
        if(minutes>=0 && seconds<=59 && seconds>=0){
        seconds=seconds+(minutes*60);
        String res=getDurationString(seconds);
        return res;
        }
        else{
            return "Enter a valid string";
        }
    }
}
