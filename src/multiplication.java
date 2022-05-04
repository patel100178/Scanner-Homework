import java.util.Scanner;

public class multiplication {
   public static void main(String[] args) {

   Scanner scanner = new Scanner(System.in);
   System.out.println("Enter the number");
   int number = scanner.nextInt();

   for(int a = 1; a <= 12; a++){
   System.out.println(number+ " * " +a+ " = "+number *a);
   }

   }

}
