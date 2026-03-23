package JavaBasics;
public class ParameterizedConstructor {
    // Instance variables
    String name;
    int age;

    // Parameterized constructor
    public ParameterizedConstructor(String n, int a) {
        name = n;
        age = a;
    }

    // Method to display values
    void display() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }

    // Main method to test
    public static void main(String[] args) {
        // Create object using parameterized constructor
        ParameterizedConstructor s1 = new ParameterizedConstructor("Alice", 20);
        ParameterizedConstructor s2 = new ParameterizedConstructor("Bob", 22);

        s1.display();
        s2.display();
    }
}
