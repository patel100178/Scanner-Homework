import java.util.Scanner;
public class primeNumber {

    public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);
    System.out.println("Enter the number");
    int num = scanner.nextInt();
    int a = 0;

    for (int i = 1; i<= num; i++){
        if (num % i == 0){
            a=a+1;
        }
    }
    if( a == 2){
        System.out.println(num+ " is prime number ");
    }
    else {
        System.out.println(num+ " is not prime number");
    }


    }

}
