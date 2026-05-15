package OOPS.java;

public class Access_modifier {
    public static void main(String[] args) {

        BankAccount bankA=new BankAccount();
        bankA.username="santosh kumar";
        System.out.println(bankA.username);

//        private modifier
//        bankA.password="kdfas";
    }
}
class BankAccount{
    public String username;
    private String password;
    void setPassword(String pass){
        password=pass;
    }
}
