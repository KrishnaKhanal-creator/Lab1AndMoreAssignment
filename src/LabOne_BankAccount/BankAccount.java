package LabOne_BankAccount;

import java.util.UUID;

public class BankAccount {
    static String name;
    static double initial_balance;

    private static  String accountNumber;


    public BankAccount(String name) {
        this.name = name;
        this.initial_balance = 0.0;
         UUID.randomUUID().toString();

    }

    public void withdrawFunds(double withdrawalAmount){
        if(initial_balance < withdrawalAmount){
            System.out.println("Insufficient funds to withdraw");
            System.exit(0);
        }
        initial_balance -= withdrawalAmount;
        System.out.println("You withdrawn: $" + withdrawalAmount );

    }

    public void depositFunds( double depositAmount){
        initial_balance += depositAmount;
        System.out.println("You deposited: $" + depositAmount);
    }
    public void displayAccountInfo(){
        System.out.println("Account name is: "+ name);
        System.out.println("Account number is: " + accountNumber);
        System.out.println("Current balance is $: " + initial_balance);
    }


}
