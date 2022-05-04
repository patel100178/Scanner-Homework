import java.util.Scanner;

public class divided3_5 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number");
        int number = scanner.nextInt();

        System.out.println(" \nDivided by: 3");
        for (int i = 1; i <= 100; i++) {
            if (i % 3 == 0)
                System.out.print(i + " ");

        }

        System.out.println(" \nDivided by: 5");
        for (int i = 1; i <= 100; i++) {
            if (i % 5 == 0)
                System.out.print(i + " ");

        }
    }
        }
