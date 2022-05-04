import java.util.Scanner;

public class minMax {


    public static void main(String[] args) {
//       int a = 56;
//       int b = 45;
//       int c = 78;
       Scanner scanner = new Scanner(System.in);
       System.out.println("Enter three number");
       int a = scanner.nextInt();
       int b = scanner.nextInt();
       int c = scanner.nextInt();
        int min = a;
        int max = a;

        if (b > max) {
            max = b;
        }
        else if (b < min){
             min = b;
    }
        if (c > max) {
            max = c;
        }
        else if (c < min){
            min = c;

    }
        System.out.println(" Minimum is " +min);
        System.out.println(" Maximum is " +max);
    }
}


