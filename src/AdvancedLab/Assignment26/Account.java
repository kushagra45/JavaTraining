package AdvancedLab.Assignment26;

public class Account {
    int accountNo;
    Customer customer;
    double balance;

    public Account(){
        System.out.println("In default constructor - account class");
    }

    public Account(int accountNo, Customer customer, double balance) {
        System.out.println("In parametrized constructor - account class");
        this.accountNo = accountNo;
        this.customer = customer;
        this.balance = balance;
    }

    public Customer getCustomer() {
        return customer;
    }

    public double balanceEnquiry(){
        return balance;
    }

    public void deposit(double amount){
        balance =+ amount;
    }
}
