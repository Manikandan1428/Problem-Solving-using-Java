import java.util.Scanner;
/**
 * simp
 */
public class simp {
    public static void main(String[] args) {
        Customer customer = new Customer("man","gghgj");
       // System.out.println(customer.getCreditLimit());
    }
}
class Customer{
    private String name;
    private int creditLimit;
    private String email;

    public String  getName(){
        return name;
    }
    public int getCreditLimit(){
        return creditLimit;
    }
    public String getEmail(){
        return email;
    }
    public Customer(String name,int creditLimit,String email){
        this.name=name;
        this.creditLimit=creditLimit;
        this.email=email;
        System.out.println("main");
    }
    public Customer(){
        this("mani", 50000, "mani123@g.com");
        System.out.println("no");
    }
    public Customer(String name,String email){
        this(name,50000,email);
        System.out.println("half");
    }
}