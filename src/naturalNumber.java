import java.util.Scanner;

public class naturalNumber {
    public static void main(String[] args) {

        int number,sum = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number");
        number =scanner.nextInt();

        for (int i = 1;i <= number;i++){
            sum = sum+i;
        }
        System.out.println("addition is "  +sum);
    }
}
