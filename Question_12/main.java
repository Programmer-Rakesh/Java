// 12.	Explain the use and rules of the final keyword in Java.

// 1. Final Variable Example:
class FinalExample {
    final int x = 10; // Final variable, value cannot be changed

    void show() {
        // x = 20; // ❌ Error: Cannot assign a value to final variable 'x'
        System.out.println("Final variable x = " + x);
    }
}

// 2. Final Method Example:
class Parent {
    final void display() { // Final method, cannot be overridden
        System.out.println("This is a final method.");
    }
}

class Child extends Parent {
    // void display() { // ❌ Error: Cannot override the final method from Parent
    // System.out.println("Trying to override...");
    // }
}

// 3. Final Class Example:
final class FinalClass {
    void showMessage() {
        System.out.println("This is a final class.");
    }
}

// class SubClass extends FinalClass { // ❌ Error: Cannot inherit from final
// class
// }

public class Main {
    public static void main(String[] args) {
        FinalExample obj = new FinalExample();
        obj.show();

        Child c = new Child();
        c.display();

        FinalClass f = new FinalClass();
        f.showMessage();
    }
}
