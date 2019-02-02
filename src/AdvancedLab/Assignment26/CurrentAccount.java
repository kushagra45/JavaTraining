package AdvancedLab.Assignment26;


public class CurrentAccount extends Account{

    double currentAmount;

    public CurrentAccount(){
    }

    public CurrentAccount(int accountNo, Customer customer, double balance, double currentAmount) {
        super(accountNo, customer, balance);
        this.currentAmount = currentAmount;
    }

    public void withdraw(double amount) throws InsufficientBalanceException{
        if(balance <= amount){
            throw new InsufficientBalanceException();
        }
        else
            balance -= amount;
    }

    public double getEligibiltyAmount(){
        double eligibleAmount = 0 - balanceEnquiry();
        return eligibleAmount;
    }
}