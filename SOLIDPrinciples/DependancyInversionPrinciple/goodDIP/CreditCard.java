package DependancyInversionPrinciple.goodDIP;

public class CreditCard implements PaymentMethod{
    public void pay(int amount){
        System.out.println("Paid with Credit Card");
    }
    
}
