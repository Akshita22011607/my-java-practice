package immutableClass;
//immutable class practice only
//An immutable class is a class whose objects cannot be modified once created.
final class Immutable1 {//Step 1: Make the class final so no one can extend it
	//Declared final to prevent other classes from inheriting it (very important for immutability).
 private final int rollNo;// Step 2: Declare all fields as private and final
 private final String name;// Step 2: Declare all fields as private and final
// private: cannot access directly from outside the class. final: cannot be changed once assigned (value is fixed).
 public Immutable1(int rollNo, String name) {//// Step 3: Constructor to set all fields
//values are assigned to the final fields.//After object is created, rollNo and name can't be changed.
	 
     this.rollNo = rollNo; // setting roll number once
     this.name = name;     // setting name once
 }
 //Only way to read values.No setters → cannot modify fields → makes the object immutable.
 public int getRollNo() { // Step 4: Only getter (no setter), read-only access
     return rollNo;
 }
 //Only way to read values. No setters → cannot modify fields → makes the object immutable.
 public String getName() {
     return name;
 }
}
public class ImmutableClass1 {
 public static void main(String[] args) {
     Immutable1 obj = new Immutable1(101, "Akshita");// Step 5: Create object of Immutable1 class
     // 📌 Step 6: Print the values using getters
     System.out.println("Roll No: " + obj.getRollNo());
     System.out.println("Name: " + obj.getName());
 }
}