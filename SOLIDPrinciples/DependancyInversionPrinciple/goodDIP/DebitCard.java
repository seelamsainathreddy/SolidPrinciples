package DependancyInversionPrinciple.goodDIP;

public class DebitCard implements PaymentMethod{

    public void pay(int amount){
        System.out.println("Paid with Debit Card");
    }
    
}
