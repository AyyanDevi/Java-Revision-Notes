import java.util.Scanner;
public class input {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Getting a String input
        System.out.print("Enter your name: ");
        String name = sc.nextLine();
        // Getting an int input
        System.out.print("Enter your age: ");
        int age = sc.nextInt();
        // Getting a double input
        System.out.print("Enter your salary: ");
        double salary = sc.nextDouble();


        System.out.println("\nYour details:");
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Salary: " + salary);
        
        sc.close();
    }
}
