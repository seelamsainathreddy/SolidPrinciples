package DesignPatterns.Creational.SingleTon.BillPugh;

public class AppConfig {

    private AppConfig() { 
    }

    private static class Holder {
        private static final AppConfig INSTANCE = new AppConfig();
    }

    public static AppConfig getInstance() {
        return Holder.INSTANCE;
    }
    
}
