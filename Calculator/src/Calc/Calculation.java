package Calc;

import java.util.*;

public class Calculation {
    private Scanner scanner;

    public Calculation() {
        this.scanner = new Scanner(System.in);
    }

    public void run() {
        boolean quit = false;
        while (!quit) {
        	System.out.println();
        	System.out.println();
            System.out.println("Welcome to the Calculator!");
            System.out.println("Please select an operation:");
            System.out.println("1. Addition");
            System.out.println("2. Subtraction");
            System.out.println("3. Multiplication");
            System.out.println("4. Division");
            System.out.println("5. Exponentiation");
            System.out.println("6. Modulo");
            System.out.println("7. Factorial");
            System.out.println("8. Square Root");
            System.out.println("9. Sine");
            System.out.println("10. Cosine");
            System.out.println("11. Tangent");
            System.out.println("12. Quit");

            int choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    performAddition();
                    break;
                case 2:
                    performSubtraction();
                    break;
                case 3:
                    performMultiplication();
                    break;
                case 4:
                    performDivision();
                    break;
                case 5:
                    performExponentiation();
                    break;
                case 6:
                    performModulo();
                    break;
                case 7:
                    performFactorial();
                    break;
                case 8:
                    performSquareRoot();
                    break;
                case 9:
                    performSine();
                    break;
                case 10:
                    performCosine();
                    break;
                case 11:
                    performTangent();
                    break;
                case 12:
                    quit = true;
                    System.out.println("Goodbye!");
                    break;
                default:
                    System.out.println("Invalid choice, please try again");
                    break;
            }
        }
    }

    private void performAddition() {
        System.out.print("Enter the first number: ");
        double num1 = scanner.nextDouble();

        System.out.print("Enter the second number: ");
        double num2 = scanner.nextDouble();

        double result = num1 + num2;
        System.out.println("\nResult: " + result);
    }

    private void performSubtraction() {
        System.out.print("Enter the first number: ");
        double num1 = scanner.nextDouble();

        System.out.print("Enter the second number: ");
        double num2 = scanner.nextDouble();

        double result = num1 - num2;
        System.out.println("\nResult: " + result);
    }

    private void performMultiplication() {
        System.out.print("Enter the first number: ");
        double num1 = scanner.nextDouble();

        System.out.print("Enter the second number: ");
        double num2 = scanner.nextDouble();

        double result = num1 * num2;
        System.out.println("\nResult: " + result);
    }

    private void performDivision() {
        System.out.print("Enter the first number: ");
        double num1 = scanner.nextDouble();

        System.out.print("Enter the second number: ");
        double num2 = scanner.nextDouble();

        if (num2 == 0) {
            System.out.println("Error: division by zero");
        } else {
            double result = num1 / num2;
            System.out.println("\nResult: " + result);
        }
    }

    private void performExponentiation() {
        System.out.print("Enter the base: ");
        double base = scanner.nextDouble();

        System.out.print("Enter the exponent: ");
        double exponent = scanner.nextDouble();
        double result = Math.pow(base, exponent);
        System.out.println("\nResult: " + result);
    }

    private void performModulo() {
        System.out.print("Enter the first number: ");
        double num1 = scanner.nextDouble();

        System.out.print("Enter the second number: ");
        double num2 = scanner.nextDouble();

        if (num2 == 0) {
            System.out.println("Error: division by zero");
        } else {
            double result = num1 % num2;
            System.out.println("\nResult: " + result);
        }
    }

    private void performFactorial() {
        System.out.print("Enter a non-negative integer: ");
        int n = scanner.nextInt();

        if (n < 0) {
            System.out.println("Error: cannot calculate factorial of a negative number");
        } else {
            int result = 1;
            for (int i = n; i > 0; i--) {
                result *= i;
            }
            System.out.println("\nResult: " + result);
        }
    }

    private void performSquareRoot() {
        System.out.print("Enter a non-negative number: ");
        double num = scanner.nextDouble();

        if (num < 0) {
            System.out.println("Error: cannot calculate square root of a negative number");
        } else {
            double result = Math.sqrt(num);
            System.out.println("\nResult: " + result);
        }
    }

    private void performSine() {
        System.out.print("Enter an angle in degrees: ");
        double angle = scanner.nextDouble();

        double result = Math.sin(Math.toRadians(angle));
        System.out.println("\nResult: " + result);
    }

    private void performCosine() {
        System.out.print("Enter an angle in degrees: ");
        double angle = scanner.nextDouble();

        double result = Math.cos(Math.toRadians(angle));
        System.out.println("\nResult: " + result);
    }

    private void performTangent() {
        System.out.print("Enter an angle in degrees: ");
        double angle = scanner.nextDouble();

        double result = Math.tan(Math.toRadians(angle));
        System.out.println("\nResult: " + result);
    }


public static void main(String[] args) {
    Calculation calculator = new Calculation();
    calculator.run();
}
}
