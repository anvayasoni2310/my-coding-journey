// Java Calculator - Version 1.0
import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char again;

        do {
            System.out.print("Enter first number: ");
            double a = sc.nextDouble();

            System.out.print("Enter second number: ");
            double b = sc.nextDouble();

            System.out.print("Choose operation (+, -, *, /): ");
            char op = sc.next().charAt(0);

            switch (op) {
                case '+':
                    System.out.println("Result: " + (a + b));
                    break;
                case '-':
                    System.out.println("Result: " + (a - b));
                    break;
                case '*':
                    System.out.println("Result: " + (a * b));
                    break;
                case '/':
                    if (b != 0) {
                        System.out.println("Result: " + (a / b));
                    } else {
                        System.out.println("Cannot divide by zero!");
                    }
                    break;
                default:
                    System.out.println("Invalid operation!");
            }

            System.out.print("Calculate again? (y/n): ");
            again = sc.next().charAt(0);

        } while (again == 'y' || again == 'Y');

        sc.close();
        System.out.println("Calculator closed!");
    }
}