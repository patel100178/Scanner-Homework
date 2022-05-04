import java.util.Scanner;

public class fibonacciNumber {
    public static void main(String[] args) {
        int number;
        int a = 0;
        int b = 1;
        int c;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number");
        number = scanner.nextInt();
        for (int i = 1;i <= number;i++){
            System.out.println(a+ " ");
           c = a + b;
           a = b;
           b = c;
        }
    }
}
