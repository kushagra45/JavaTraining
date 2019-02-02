package AdvancedLab.Assignment26;

import AdvancedLab.Assignment13.CurrentAccount;
import AdvancedLab.Assignment13.Customer;
import AdvancedLab.Assignment13.SavingsAccount;

public class WellsBank  {

    public static void main(String[] args) {
        Customer john = new Customer(10, "John", "Irving", 76013);
        SavingsAccount johnSA = new SavingsAccount(101, john, 1000, 500, 12);
        johnSA.deposit(1000);
        System.out.println("Available balance for John is " + johnSA.balanceEnquiry());
        System.out.println(johnSA.balanceEnquiry());
    }
}