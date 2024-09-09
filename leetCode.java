import java.util.Arrays;

public class leetCode {
    public static void main(String[] args) {
        int []arr={7,8,9,11,12};
        int a=1;
        Arrays.sort(arr);
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]<=0){
                continue;
            }
            else{
                if(arr[i]==a){
                    a++;
                }
                
            }
        }
        System.out.println(a);
    }
}
