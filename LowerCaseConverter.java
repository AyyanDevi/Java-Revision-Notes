public class LowerCaseConverter {
	public static void main(String[] args) {
		String str = "HELLO, WORLD!";
		String result = ""; // Initialize an empty string

		// Loop through the string
		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			if (ch >= 'A' && ch <= 'Z') {
				ch = (char) (ch + 32); // Convert to lowercase
			}
			result += ch; // Append to result string
		}
		System.out.println("Lowercase: " + result);
	}
}
