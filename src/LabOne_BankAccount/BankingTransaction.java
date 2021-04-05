package LabOne_BankAccount;

public class BankingTransaction extends BankAccount{

    final double transactionfee = 2.5;
    final double intrestrate = 0.03;

    @Override
    public void withdrawFunds(double withdrawalAmount) {
        super.withdrawFunds(withdrawalAmount);
        initial_balance -= transactionfee;
    }

    @Override
    public void depositFunds(double depositAmount) {
        super.depositFunds(depositAmount);
        initial_balance += (initial_balance* intrestrate);
    }

    public BankingTransaction(String name) {
        super(name);
    }

}
