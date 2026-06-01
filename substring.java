public class substring {
	public static void main(String[] args) {
		String str = "Hello, World!";
		int start = 7;
		int end = 12;
		String result = "";
		for (int i = start; i < end; i++) {
			result += str.charAt(i);
		}

		System.out.println("Substring: " + result);
	}
}
