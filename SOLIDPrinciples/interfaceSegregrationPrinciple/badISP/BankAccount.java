package interfaceSegregrationPrinciple.badISP;

public interface BankAccount {
    void deposit(double amount);
    void withdraw(double amount);
    void requestLoan(double amount);    
}
