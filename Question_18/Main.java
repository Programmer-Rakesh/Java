// 18.	Write a program to demonstrate the use of if-else, switch-case, and loops (for, while, do-while).

public class Main {
    public static void main(String[] args) {
        
        // If-Else
        int num = 7;
        System.out.println(num % 2 == 0 ? "Even" : "Odd");

        // Switch-Case
        int day = 2;
        switch (day) {
            case 1: System.out.println("Monday"); break;
            case 2: System.out.println("Tuesday"); break;
            default: System.out.println("Other Day");
        }

        // For Loop
        for (int i = 1; i <= 3; i++) System.out.println("For: " + i);

        // While Loop
        int j = 1;
        while (j <= 2) { System.out.println("While: " + j); j++; }

        // Do-While Loop
        int k = 1;
        do { System.out.println("Do-While: " + k); k++; } while (k <= 2);
    }
}