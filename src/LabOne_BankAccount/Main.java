package LabOne_BankAccount;

public class Main {
    public static void main(String[] args) {
        BankingTransaction account1 = new BankingTransaction("krishna");

        account1.displayAccountInfo();
        System.out.println("------");

        account1.depositFunds(500);
        account1.displayAccountInfo();

        System.out.println("--------");
        account1.withdrawFunds(300);
        account1.displayAccountInfo();

        System.out.println("-------New Object created--------");
        System.out.println("+++++++++++++++++++++++++++++++++");


        BankingTransaction account2 = new BankingTransaction("Karan");
        account2.displayAccountInfo();
        System.out.println("------");

        account2.depositFunds(100.0);
        account2.displayAccountInfo();

        System.out.println("--------");
        account2.withdrawFunds(100.0);
        account2.displayAccountInfo();

        System.out.println("-------New Object created--------");
        System.out.println("+++++++++++++++++++++++++++++++++");

        BankingTransaction account3 = new BankingTransaction("Jhon");
        account3.displayAccountInfo();
        System.out.println("------");

        System.out.println("--------");
        account3.withdrawFunds(100.0);
        account3.displayAccountInfo();

        account3.depositFunds(100.0);
        account3.displayAccountInfo();

        System.out.println("--------");
        account3.withdrawFunds(100.0);
        account3.displayAccountInfo();


    }
}
