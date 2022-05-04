import java.util.Scanner;

public class reverseNumber {

    public static void main(String[] args) {
        int num;
        int rem;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number");
        num = scanner.nextInt();

        while(num >0){
            rem=num%10;
            System.out.print( +rem);
            num = num/10;

        }
        }
    }
