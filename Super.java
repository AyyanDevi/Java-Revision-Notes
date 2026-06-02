class Animal { 
void sound() { 
System.out.println("Animal makes a sound"); 
} 
Animal() { 
System.out.println("Animal constructor called"); 
} 
} 
class Dog extends Animal { 
Dog() { 
super(); // Calls the superclass constructor 
System.out.println("Dog constructor called"); 
} 
@Override 
void sound() { 
super.sound(); // Calls the superclass method 
System.out.println("Dog barks"); 
} 
} 
public class Super { 
public static void main(String[] args) { 
Dog dog = new Dog(); // Output: Animal constructor called, Dog constructor called 
dog.sound();         // Output: Animal makes a sound, Dog barks 
} 
} 
