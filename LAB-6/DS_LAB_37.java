/* Create a class BankAccount with attributes like account number, balance, 
account holder and name. Create an array of BankAccount objects to store 
bank accounts. Implement methods to deposit money, withdraw money and 
check balance. */

import java.util.*;

class BankAccount {
    int accountNumber;
    double balance;
    String accountHolderName;
    public BankAccount(int accountNumber,double balance,String accountHoderName){
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.accountHolderName = accountHoderName;
    }
    public void deposit (int money){
        balance += money;
        System.out.println();
        System.out.println("Sucessfully Deposited "+money+".");
        System.out.println(accountHolderName+" your Current Balance is : "+balance);
    }
    public void withdraw (int money){
        if(money <= balance){
            balance -= money;
            System.out.println();
            System.out.println("Sucessfully Withdrawel "+money+".");
            System.out.println(accountHolderName+" your Current Balance is : "+balance);
        }else{
            System.out.println();
            System.out.println("Eror!");
            System.out.println("Your Current Balance is Lower then your withdrawl amount.");
            System.out.println(accountHolderName+" your Current Balance is : "+balance);
        }
    }
    public void checkBalance(){
        System.out.println();
        System.out.println(accountHolderName+" your Current Balance is : "+balance);
    }
}

public class DS_LAB_37 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        BankAccount [] bankAccounts = new BankAccount[5];

        int [] accountNumber = {67854,12345,67890,87432,59821};
        String [] accountHolderName = { "Maidan","Ajay","Dixit","Vishal","Mohan"};
        double [] balance = {10000,15000,5000,7000,78000};

        for(int i=0;i<bankAccounts.length;i++){
            bankAccounts[i] = new BankAccount(accountNumber[i],balance[i],accountHolderName[i]);
        }
        
        bankAccounts[0].deposit(5000);//10,000+5000
        bankAccounts[1].withdraw(7000);//15,000-7000
        bankAccounts[2].withdraw(5000);//5000-5000
        bankAccounts[3].withdraw(10000);//7000-10,000 Error!
        bankAccounts[4].checkBalance();
    }
}
