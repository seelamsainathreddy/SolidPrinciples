package DependancyInversionPrinciple.badDIP;

public class PaymentProcessor {

    private DebitCard card = new DebitCard();

    public void process(int amount){
        card.makePayment(amount);
    }
    
}
