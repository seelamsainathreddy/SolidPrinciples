package ObjectOrientedPrinciples.Encapsulation.noEncapsulation;



public class BankAccount {
    public double balance; 

    public void deposit(double amount) {
        balance += amount;
    }
}
