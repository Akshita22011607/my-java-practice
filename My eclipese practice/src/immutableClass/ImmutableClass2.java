package immutableClass;
// Immutable class is a class whose objects cannot be modified once created. Like String class
// To make a class immutable, use: Final Class ,Private Fields ,No Setters (only Getters = Read Only) 
// Constructor Initialization,Final Fields
final class Student {// 1️ Final class to prevent inheritance
 private final int rollNumber;// 2️ Private and final fields (once set, can’t be changed)
 private final String name;
 public Student(int rollNumber, String name) {//3️ Constructor to initialize values during object creation
     this.rollNumber = rollNumber;
     this.name = name;
 }
 // 4️ Only Getters — No Setters!
 public int getRollNumber() {
     return rollNumber;
 }
 public String getName() {
     return name;
 }
}
public class ImmutableClass2 {
 public static void main(String[] args) {
     // 🆕 Creating immutable object
     Student student1 = new Student(101, "Akshita");
     // 🖨️ Accessing values using getters
     System.out.println("Roll Number: " + student1.getRollNumber());
     System.out.println("Name: " + student1.getName());
     // ❌ We cannot change values as there are no setters!
     // student1.name = "NewName"; → ❌ Not allowed
 }
}