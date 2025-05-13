package DesignPatterns.Creational.BuilderPattern;

public class User {
    // Required
    private final String username;
    private final String email;

    // Optional
    private final String phone;
    private final String address;
    private final int age;

    // Private constructor
    private User(Builder builder) {
        this.username = builder.username;
        this.email = builder.email;
        this.phone = builder.phone;
        this.address = builder.address;
        this.age = builder.age;
    }

    // Builder static nested class
    public static class Builder {
        private final String username;
        private final String email;
        private String phone;
        private String address;
        private int age;

        public Builder(String username, String email) {
            this.username = username;
            this.email = email;
        }

        public Builder phone(String phone) {
            this.phone = phone;
            return this;
        }

        public Builder address(String address) {
            this.address = address;
            return this;
        }

        public Builder age(int age) {
            this.age = age;
            return this;
        }

        public User build() {
            // you can add validation here if needed
            return new User(this);
        }
    }

    @Override
    public String toString() {
        return "User{username='" + username + "', email='" + email + "', phone='" + phone + "', address='" + address + "', age=" + age + "}";
    }

    
}
