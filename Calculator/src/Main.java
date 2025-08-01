import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double number1, number2, result = 0;
        char operator;

        System.out.println("--- Simple Calculator ---");

        // Asks for the operator
        System.out.print("Enter the operator (+, -, *, /): ");
        operator = input.next().charAt(0);

        // Asks for the first number
        System.out.print("Enter the first number: ");
        number1 = input.nextDouble();

        // Asks for the second number
        System.out.print("Enter the second number: ");
        number2 = input.nextDouble();

        // Performs the operation based on the chosen operator
        switch (operator) {
            case '+':
                result = number1 + number2;
                break;
            case '-':
                result = number1 - number2;
                break;
            case '*':
                result = number1 * number2;
                break;
            case '/':
                // Handles division by zero
                if (number2 == 0) {
                    System.out.println("Error: Cannot divide by zero.");
                    return; // Terminates the program
                }
                result = number1 / number2;
                break;
            default:
                System.out.println("Error: Invalid operator.");
                return; // Terminates the program
        }

        // Displays the result
        System.out.println("The result of the operation is: " + result);

        input.close();
    }
}