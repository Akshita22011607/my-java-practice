package OOPS_1_inheitance;

class Daddy { // Parent class
    int a;
    char c;
    boolean bl;

    // Constructor 1: Accepts a single char
    Daddy(char c) {
        super(); // Optional, because Java automatically calls Object class constructor
        System.out.println("Parent char");
    }

    // Constructor 2: Accepts int, boolean, and char
    Daddy(int a, boolean bl, char c) {
        super();
        System.out.println("Parent int n boolean");
    }
}

class Baby extends Daddy { 
    float fl;

    // Constructor 1: Calls Parent Constructor (int, boolean, char)
    Baby(char c, boolean bl, int a) {
        super(a, bl, c); // Fixed: Calls the correct constructor from Daddy
        System.out.println("Child Constructor 1");
    }

    // Constructor 2: Calls Parent Constructor (char)
    Baby(boolean bl, int a,float fl) {
        super('A'); // Fixed: Pass a valid character
        System.out.println("Child Constructor 2");
    }
}

public class SuperStatement4 {
    public static void main(String[] args) {
        Baby objB = new Baby(true, 10,20.5f);    // Calls Daddy(char)
        System.out.println();
        Baby objB2 = new Baby('A', true, 10); // Calls Daddy(int, boolean, char)
    }
}
