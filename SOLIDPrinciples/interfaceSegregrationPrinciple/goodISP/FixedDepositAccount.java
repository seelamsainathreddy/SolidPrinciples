package interfaceSegregrationPrinciple.goodISP;

public class FixedDepositAccount implements Depositable {
    public void deposit(double amount){
        System.out.println("FD account credited");
    }
}
