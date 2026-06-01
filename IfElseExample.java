import java.util.Scanner;

public class IfElseExample {

    public static void main(String[] args) {

        // Create a Scanner object
        Scanner sc = new Scanner(System.in);

        // Prompt the user for a number
        System.out.print("Enter a number: ");
        int number = sc.nextInt();

        // Check odd or even using if-else
        if (number % 2 == 0) {
            System.out.println(number + " is Even Number");
        } else {
            System.out.println(number + " is Odd Number");
        }

        // Close scanner
        sc.close();
    }
}