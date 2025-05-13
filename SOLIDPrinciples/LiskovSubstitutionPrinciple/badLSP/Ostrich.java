package LiskovSubstitutionPrinciple.badLSP;

public class Ostrich extends Bird{

    @Override
    public void fly(){
        throw new UnsupportedOperationException("Ostriches Can't fly");
    }
    
}
