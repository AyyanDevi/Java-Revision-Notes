class Person { 
String name; 
// Constructor 
Person(String name) { 
this.name = name; // Using 'this' to refer to the instance variable 
} 
void display() { 
System.out.println("Name: " + this.name); // Using 'this' to refer to the current object 
} 
} 
public class This_E { 
public static void main(String[] args) { 
Person person = new Person("Alice"); 
person.display(); // Output: Name: Alice 
} 
}