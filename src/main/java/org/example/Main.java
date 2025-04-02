package org.example;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world");
        Person person1 = new Person("John", "Doe", 20);
        System.out.println("Firstname: " + person1.getFirstName());
        System.out.println("Lastname: " + person1.getLastName());
        System.out.println("Age: " + person1.getAge());

        Person person2 = new Person("Jane", "Doe", 16, "123 Main St", "123-456-7890", "jane.doe@example.com");
        System.out.println("Firstname: " + person2.getFirstName());
        System.out.println("Age: " + person2.getAge());
        System.out.println("Is Teen: " + person2.isTeen());

        Wall wall = new Wall(5, 4);
        System.out.println("Area: " + wall.getArea());

        // Testing setters
        wall.setHeight(-1.5);
        System.out.println("Width: " + wall.getWidth());
        System.out.println("Height: " + wall.getHeight());
        System.out.println("Area: " + wall.getArea());
    }
}
