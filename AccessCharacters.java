
public class AccessCharacters {
	public static void main(String[] args) {
    	String str = "Hello, World!";
    	// Accessing characters using charAt()
    	System.out.println("Original String: " + str);
    	for (int i = 0; i < str.length(); i++) {
        	char ch = str.charAt(i); // Access character at index i
        	System.out.println("Character at index " + i + ": " + ch);
    	}
	}
}
