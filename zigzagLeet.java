/**
 * zigzagLeet
 */
public class zigzagLeet {

    public static void main(String[] args) {
        zigzagLeet obj = new zigzagLeet();
        obj.convert("paypalishiring", 4);
    }

    
        public void convert(String s, int numRows) {
            String sd="";
            int col=0;
            int len = s.length();
            while(len>0){
                len=len-numRows;
                col++;
                if(len>0){
                    for(int i=0;i<numRows-2;i++){
                        len=len-1;
                        col++;
                        if(len==0){
                            break;
                        }
                    }
                }
            }
            
            int a=0;
            int b=0;
            int co=1;
            char [][]arr=new char [col][numRows];
            char [][]arr1=new char [numRows][col];
           for(int i=0;i<col;i=i+0){
               if(b==0){
                for(int j=0;j<numRows;j++){
                    if(a<s.length()){
                            arr[i][j]=s.charAt(a);
                            a++;
                            
                        }
                    else{
                        break;
                        }
                        
                }
                b=numRows-2;
                i++;
                co=1;
               }
               
               
               else{
                   if(a<s.length() &&  co<numRows-1){
                    
                    arr[i][co]=s.charAt(a);
                    a++;
                    i++;
                    co++;
                    b-=1;
                   }
               }
           }
           
           
           for(int i=0;i<col;i++){
               for(int j=0;j<numRows;j++){
                   arr1[j][i]=arr[i][j];
               }
           }
           for(int i=0;i<numRows;i++){
               for(int j=0;j<col;j++){
                   sd+=arr1[i][j];
               }
           }
           System.out.println(sd);
    
        }
    }
    
