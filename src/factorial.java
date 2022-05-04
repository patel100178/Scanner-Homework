import java.util.Scanner;

public class factorial {

    public static void main(String[] args) {
        int number,fact = 1;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number");
        number =scanner.nextInt();

        for (int i = 1;i <= number;i++){
            fact = fact*i;
        }
        System.out.println("factorial is "  +fact);
    }
}
