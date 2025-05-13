package interfaceSegregrationPrinciple.badISP;

public class FixedDepositAccount implements BankAccount{

    @Override
    public void deposit(double amount) {
        System.out.println("Amount deposited to FD");
    }

    @Override
    public void withdraw(double amount) {
        throw new UnsupportedOperationException("Unimplemented method 'withdraw'");
    }

    @Override
    public void requestLoan(double amount) {
        throw new UnsupportedOperationException("Unimplemented method 'requestLoan'");
    }

    

    
}
