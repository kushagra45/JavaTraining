package AdvancedLab.Assignment17;

public class WellsBank {

    public static void main(String[] args) {
        Customer john = new Customer(10, "John", "Irving", 76013);
        SavingsAccount johnSA = new SavingsAccount(101, john, 3000, 500, 12);
        johnSA.withdraw(1600);
        System.out.println(johnSA.balanceEnquiry());

        Customer jenny = new Customer(11, "Jenny", "Arlington", 76014);
        CurrentAccount jennyCA = new CurrentAccount(201, jenny, 500, 2000);
        System.out.println(jennyCA.balanceEnquiry());

    }
}
