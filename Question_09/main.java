// 9. What is method overloading? How is it different from method overriding?

// Overloading = Same class, different parameters, It happens at compile time.
// Overriding = Different classes (parent-child), same method, It happens at runtime.


// Overloading
class MathOperation {
    int add(int a, int b) {
        return a + b;
    }

    int add(int a, int b, int c) {
        return a + b + c;
    }
}


// Overriding
class Animal {
    void sound() {
        System.out.println("Animal makes a sound");
    }
}

class Dog extends Animal {
    void sound() {
        System.out.println("Dog barks");
    }
}
