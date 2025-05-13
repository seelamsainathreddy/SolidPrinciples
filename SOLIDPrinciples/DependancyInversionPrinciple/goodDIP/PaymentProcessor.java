package DependancyInversionPrinciple.goodDIP;

public class PaymentProcessor {
    private final PaymentMethod method;

    public PaymentProcessor(PaymentMethod  method){
        this.method = method;
    }

    public void process(int amount){
        method.pay(amount);
    }

    
}
