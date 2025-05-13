package DesignPatterns.Creational.SingleTon.Eager;

public class AppConfig {
    public static final AppConfig instance = new AppConfig();

    private AppConfig(){
        //private constructor
    }

    public static AppConfig getInstance() {
        return instance;
    }
    
}
