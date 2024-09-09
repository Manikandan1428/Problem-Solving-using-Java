public class reverseLeet {
    public static void main(String[] args) {
        reverseLeet rev = new reverseLeet();
        rev.reverse(1534236469);
    }
    
        public int reverse(int x) {
            int n=x;
            int temp=0;
            if(x<0){
                x=0-x;
            }
            while(x>0){
                temp=(temp*10)+(x%10);
                if(temp<Math.pow(-2,31) ||temp>(Math.pow(2,31)-1) ){
                    return 0;
                }
                x=x/10;
            }
                System.out.println(temp+" "+x);
            
            // if(n<0){
            //     temp=0-temp;
            // }
            
                return temp;
            
              
        }
}

