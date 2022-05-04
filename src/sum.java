import java.util.Scanner;

public class sum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number");
        int sum = scanner.nextInt();

        for (int i = 1; i<= 20; i++){
//        for ( int j = 1; j <= i; j++){
        sum = sum + i;

            System.out.println(sum);
        }
    }
}
