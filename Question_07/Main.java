public class Main {
    public static void main(String[] args) {
        Student word = new Student();
        word.Student();
        word.Student("Rakesh");
    }
}

class Student {
    public void Student() { // Default constructor
        System.out.println("Default Constructor");
    }

    public void Student(String name) { // Parameterized constructor
        System.out.println("Hello " + name);
    }
}
