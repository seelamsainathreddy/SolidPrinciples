package ObjectOrientedPrinciples.Abstraction;

public class UpiPayment implements PaymentMethod {
    public void pay(int amount){
        System.out.println("Paid $" + amount + " Via UPI");
    }
}
