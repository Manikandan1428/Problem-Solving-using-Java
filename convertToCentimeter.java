public class convertToCentimeter {
    public static void main(String[] args) {
        convertToCentimeter(20);
        convertToCentimeter(6, 8);
    }
    public static void convertToCentimeter(int inch){
        Double a = Double.valueOf(inch);
        a=a*2.54;
        System.out.println(a);
    }
    public static void convertToCentimeter(int feet,int inch){
        int ftoinch = feet*12;
        int finch = ftoinch+inch;
        convertToCentimeter(finch);
    }

}
