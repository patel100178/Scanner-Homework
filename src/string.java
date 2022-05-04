import java.util.Scanner;

public class string {
    public static void main(String[] args) {
     Scanner scanner = new Scanner(System.in);
     System.out.println("Enter a name");
     String name = scanner.next();
     int count = 0;
     for(int i = 0; i < name.length();i++){
         if (name.charAt(i) == ' ');
         count ++;
     }
        System.out.println("Total number of character in the string = " +count);
    }


}




