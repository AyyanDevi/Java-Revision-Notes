
import java.util.Scanner;
 
public class ifExample {
	public static void main(String[] args) {
    	
    	Scanner sc = new Scanner(System.in);
    	System.out.print("Enter a number: ");
    	int number = sc.nextInt();
    	// Check if the number is positive
    	if (number > 0) {
        	System.out.println("The number is positive.");
    	}

    	sc.close();
	}
}
