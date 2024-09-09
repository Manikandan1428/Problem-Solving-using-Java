import java.math.BigInteger;

public class classesChallenge {
    public static void main(String[] args) {
        Account account = new Account();
        account.setaccountBalance(10000);
        account.withDrawal(100000);
        
        

    }
        
    
}
class Account{
    private int  accountNumber=123456;
    private int accountBalance=1000;
    private String customerName="Mani";
    private String email="mani123@gmail.com";
    private String phoneNumber="7412589632";


    public int getaccountNumber(){
        return accountNumber;
    }
    public int getaccountBalance(){
        return accountBalance;
    }
    public String getcustomerName(){
        return customerName;
    }
    public String getemail(){
        return email;
    }
    public String getphoneNumber(){
        return phoneNumber;
    }
    public void setaccountNumber(int accountNumber){
        this.accountNumber=accountNumber;
    }
    public void setaccountBalance(int accountBalance){
        this.accountBalance=accountBalance;
    }
    public void setcustomerName(String customerName){
        this.customerName=customerName;
    }
    public void setemail(String email){
        this.email=email;
    }
    public void setphoneNumber(String phoneNumber){
        this.phoneNumber=phoneNumber;
    }
    public void withDrawal(int amount){
        if(amount<=accountBalance){
            accountBalance=accountBalance-amount;
            System.out.println(amount+" debited from your "+accountNumber);
            System.out.println("Account balance is :"+accountBalance);
        }
        else{
            System.out.println("Enter the amount lesser than "+accountBalance);
        }
    }
    public void deposit (int amount ){
        accountBalance=amount+accountBalance;
        System.out.println(amount+" credited to your "+accountNumber);
        System.out.println("Account balance is :"+accountBalance);
    }
}
