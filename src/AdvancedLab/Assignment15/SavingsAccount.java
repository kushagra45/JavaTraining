package AdvancedLab.Assignment15;

public class SavingsAccount extends Account {

    double minimumBalance;
    int interestRate;

    public SavingsAccount(){

    }

    public SavingsAccount(int accountNo, Customer customer, double balance, double minimumBalance, int interestRate){
        super(accountNo, customer, balance);
        this.minimumBalance = minimumBalance;
        this.interestRate = interestRate;
    }

    public void withdraw(double amount){
        if(amount < 500){
            balance -= amount;
        }
        else
            System.out.println("Insufficient balance");
    }

    public void calculateInterest(){
        double interest = balanceEnquiry() + (12 / 100);
        System.out.println(interest + " -> the interest generated on the available balance");
    }
}
