package DependancyInversionPrinciple.badDIP;

public class Switch {

    private LightBulb bulb = new LightBulb();

    public void operate() {
        bulb.turnOn();
    }
    
}
