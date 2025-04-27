// Q8. Explain the difference between this and super keywords in Java with examples.

// Example of this :

class Car {
    String name;

    Car(String name) {
        this.name = name; // 'this' refers to the current object's name
    }
}

// Example of super :

class Vehicle {
    void display() {
        System.out.println("Vehicle is running");
    }
}

class Bike extends Vehicle {
    void display() {
        super.display(); // calls parent (Vehicle) class method
        System.out.println("Bike is running");
    }
}
