public class Paraneterized_Constructor { 
int modelYear; 
String modelName; 
public Paraneterized_Constructor(int year, String name) { 
modelYear = year; 
modelName = name; 
} 
public static void main(String[] args) { 
Paraneterized_Constructor myCar = new Paraneterized_Constructor(1969, "Mustang"); 
System.out.println(myCar.modelYear + " " + myCar.modelName); 
} 
}