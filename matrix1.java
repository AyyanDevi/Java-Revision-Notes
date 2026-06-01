public class matrix1 {
	public static void main(String[] args) {
		String str = "Hello, World!";
		String reversed = " ";
		// Loop through the string from the end to the beginning
		for (int i = str.length() - 1; i >= 0; i--) {
			reversed += str.charAt(i);
		}
		System.out.println("Original: " + str);
		System.out.println("Reversed: " + reversed);
	}
}
