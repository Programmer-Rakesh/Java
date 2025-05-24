class second {
    String name;
    int roll;

    second(String name, int roll) {
        this.name = name;
        this.roll = roll;
    }

    void display() {
        System.out.println("Name: " + name + ", Roll No: " + roll);
    }

    public static void main(String[] args) {
        second s = new second("Rakesh", 101);
        s.display();
    }
}
