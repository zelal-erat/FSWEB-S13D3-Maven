package org.example;

public class Person {

    // Instance Variables
    private String firstName;
    private String lastName;
    private int age;

    // Extra Instance Variables
    private String address;
    private String phoneNumber;
    private String email;

    // Constructor 1 (Basic)
    public Person(String firstName, String lastName, int age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
    }

    // Constructor 2 (Overloaded with additional parameters)
    public Person(String firstName, String lastName, int age, String address, String phoneNumber, String email) {
        this(firstName, lastName, age);  // Constructor chaining
        this.address = address;
        this.phoneNumber = phoneNumber;
        this.email = email;
    }

    // Getter Methods
    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getAge() {
        return age;
    }

    // Additional Getter Methods for extra variables
    public String getAddress() {
        return address;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public String getEmail() {
        return email;
    }

    // Method to check if the person is a teenager
    public boolean isTeen() {
        return age >= 13 && age <= 19;
    }
}