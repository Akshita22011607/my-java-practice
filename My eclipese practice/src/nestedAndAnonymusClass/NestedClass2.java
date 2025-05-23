package nestedAndAnonymusClass;
//nested class example with Static and non static method in it.
public class NestedClass2 {//outer class
    static class Example1 { // ✅ Static nested class
        // ✅ Static method inside static nested class // This method performs addition of two numbers and prints the result
        public static void AdditionOfTwo() {
            int a = 10, b = 20; // Declare and initialize variables
            int sum = a + b; // Add the two numbers
            System.out.println("Static Method Output: " + sum); // Print the sum
        }
        // ✅ Non-static method inside static nested class // This method performs multiplication of two numbers and returns the result
        public int MultiplicationOfTwo(int x, int y) {
            return x * y; // Multiply the two numbers and return the result
        }
    }
    public static void main(String[] args) {
        // ✅ Calling the static method of the nested class  // This can be done without creating an object of the nested class
        NestedClass2.Example1.AdditionOfTwo();
        
        // ✅ Create an object of the static nested class Example1 // This is needed to call the non-static method
        NestedClass2.Example1 example = new NestedClass2.Example1();
        
        // ✅ Calling the non-static method from the nested class using an object
        int result = example.MultiplicationOfTwo(10, 5);
        System.out.println("Non-Static Method Output: " + result); // Print the multiplication result
    }
}