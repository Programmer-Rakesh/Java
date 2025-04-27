// 5. Discuss Java’s control flow statements with syntax and examples.

// if statement
if (a > b) {
    System.out.println("A is greater");
}

// if-else statement
if (a > b) {
    System.out.println("A");
} else {
    System.out.println("B");
}

// if-else-if ladder
if (a > b) {
    System.out.println("A is greater");
} else if (a == b) {
    System.out.println("A and B are equal");
} else {
    System.out.println("B is greater");
}

// switch statement
int day = 2;
switch (day) {
    case 1:
        System.out.println("Monday");
        break;
    case 2:
        System.out.println("Tuesday");
        break;
    default:
        System.out.println("Other day");
}

// for loop
for (int i = 0; i < 5; i++) {
    System.out.println(i);
}

// while loop
int i = 0;
while (i < 5) {
    System.out.println(i);
    i++;
}

// do-while loop
int j = 0;
do {
    System.out.println(j);
    j++;
} while (j < 5);

// break statement inside a loop
for (int k = 0; k < 5; k++) {
    if (k == 3)
        break;
    System.out.println(k);
}

// continue statement inside a loop
for (int m = 0; m < 5; m++) {
    if (m == 2)
        continue;
    System.out.println(m);
}

// return statement inside a method
public static void checkNumber(int num) {
    if (num < 0) {
        return;
    }
    System.out.println("Number is positive");
}
