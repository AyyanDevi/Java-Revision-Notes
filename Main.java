class Person {
	// Private variables
	private String name;
	private int age;

	// Constructor
	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		if (age > 0) {
			this.age = age;
		} else {
			System.out.println("Age must be positive.");
		}
	}
}

public class Main {
	public static void main(String[] args) {

		Person person = new Person("Alice", 25);

		// Accessing the name and age using getters
		System.out.println("Name: " + person.getName());
		System.out.println("Age: " + person.getAge());

		// Modifying the name and age using setters
		person.setName("Bob");
		person.setAge(30);

		// Display updated information
		System.out.println("Updated Name: " + person.getName());
		System.out.println("Updated Age: " + person.getAge());

		// Attempt to set an invalid age
		person.setAge(-5); // This should print an error message
	}
}
