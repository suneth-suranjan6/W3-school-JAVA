public class Student {

    // Instance Variables (Each student has their own)
    String name;
    int age;

    // Static Variable (Shared by all students)
    static String schoolName = "Greenwood High";

    public static void main(String[] args) {
        
        // Create first student object
        Student s1 = new Student();
        s1.name = "Alice";
        s1.age = 15;

        // Create second student object
        Student s2 = new Student();
        s2.name = "Bob";
        s2.age = 16;

        // Print details
        System.out.println(s1.name + " is " + s1.age + " years old from " + schoolName);
        System.out.println(s2.name + " is " + s2.age + " years old from " + schoolName);
    }
}
