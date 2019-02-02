package AdvancedLab.Assignment17;

public class CurrentAccount extends Account {

    double currentAmount;

    public CurrentAccount(int accountNo, Customer customer, double balance, double currentAmount) {
        super(accountNo, customer, balance);
        this.currentAmount = currentAmount;
    }

    public void withdraw(double amount){
        if(amount <= 500){
            balance -= amount;
        }
        else{
            System.out.println("Insufficient balance available");
        }
    }

    public double getEligibiltyAmount(){
        double eligibleAmount = 0 - balanceEnquiry();
        return eligibleAmount;
    }
}
