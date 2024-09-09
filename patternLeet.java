import java.math.BigInteger;
/**
 * patternLeet
 */
public class patternLeet {

    public static void main(String[] args) {
        patternLeet pl = new patternLeet();
        System.out.println(pl.myAtoi("000+85"));
    }

    public int myAtoi(String s) {

        String str="";
        long cou=0;
        long numc=0;
        
        
      for(int i=0;i<s.length();i++){
          char ch= s.charAt(i);
          if(ch=='+'||ch=='-'){
                  cou++;
                   if(cou>1){
                       if(numc==0){
                           return 0;
                       }
                       else if(numc>=1 && cou>0){
                           if(str.equals("0")){
                               return 0;
                           }
                           else{
                               break;
                           }
                           
                       }
                       else{
                           break;
                       }
                      
                    }
                    if(numc>=1 && cou>0){
                        if(str.equals("0")){
                            return 0;
                        }
                        else{
                            break;
                        }
                    }
              }
          if(ch==' '){
              if(numc==0 && cou==0){
                continue;
              }
              else{
                  break;
              }
          }
          
          else if(Character.isLetter(ch)||ch=='.' ){
              break;
          }
          else if(Character.isDigit(ch)){
              numc++;
              str+=ch;
              System.out.println(str);
          }
          else if(ch=='-'){
              if(numc==0){
                str+=ch;
              }
              else{
                  break;
              }
          }
      }
     
            
              
          if(str.length()==0 || str.equals("-")){
              return 0;
          }
  
        //System.out.println(str);
          try{
            BigInteger st=new BigInteger(str);
        if (st.compareTo(BigInteger.valueOf(Integer.MIN_VALUE)) < 0) {
            return Integer.MIN_VALUE;
        } else if (st.compareTo(BigInteger.valueOf(Integer.MAX_VALUE)) > 0) {
            return Integer.MAX_VALUE;
        } else {
            return st.intValue();
        }
    }
      catch(NumberFormatException e){
         
          return 0;
      }
       
      
       
    }
}