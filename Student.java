public class Student {
    // Instance variables
    String name;
    int age;

    public static void main(String[] args) {
        // Calling the implicit default constructor injected by the compiler
        Student student1 = new Student();

        // Displaying default values assigned by the system
        System.out.println("Student Name: " + student1.name); // Outputs: null
        System.out.println("Student Age: " + student1.age);   // Outputs: 0
    }
}

    

