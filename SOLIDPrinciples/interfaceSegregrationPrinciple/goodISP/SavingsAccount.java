package interfaceSegregrationPrinciple.goodISP;

public class SavingsAccount implements Depositable, Withdrawable, LoanEligible {
    public void deposit(double amount) { System.out.println("Deposited"); }
    public void withdraw(double amount) { System.out.println("Withdrawn"); }
    public void requestLoan(double amount) { System.out.println("Loan requested"); }
}
