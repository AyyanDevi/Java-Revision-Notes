public class ArrayExample {
	public static void main(String[] args) {
		// Declaration and initialization
		int[] numbers = { 1, 2, 3, 4, 5 };

		// Accessing and printing array elements
		System.out.println("Array elements:");
		for (int i = 0; i < numbers.length; i++) {
			System.out.println("Element at index " + i + ": " + numbers[i]);
		}
		// Modifying an element
		numbers[2] = 10; // Changing the value at index 2 (third element)
		System.out.println("After modification:");
		System.out.println("Element at index 2: " + numbers[2]);
	}
}
