import java.util.Scanner;

public class calculator {
    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Select an operator: +, -, * or /");
    char operator = scanner.next().charAt(0);

    System.out.println("Enter first number");
    double a = scanner.nextDouble();

    System.out.println("Enter second number");
    double b = scanner.nextDouble();

    switch (operator){
        case '+':
        System.out.println("Addition is " + (a + b));
        break;
        case '-':
        System.out.println("Subtraction is " +(a - b));
        break;
        case '/':
        System.out.println("Division is " +(a / b));
        break;
        case '*':
        System.out.println("Multiplication " +(a * b));
        break;
        default:
        System.out.println("Invalid operator");
        break;

    }
    }
}
