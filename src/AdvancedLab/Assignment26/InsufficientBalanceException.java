package AdvancedLab.Assignment26;

public class InsufficientBalanceException extends Exception {

    public InsufficientBalanceException(){
        super("Sufficient balance not available");
    }
}
