package DesignPatterns.Creational.BuilderPattern;

public class Main {
    public static void main(String[] args) {
        User user = new User.Builder("john_doe", "john@example.com")
                        .age(30)
                        .phone("1234567890")
                        .address("Bangalore")
                        .build();

        System.out.println(user);
    }
}
