class Student {
    String name;
    int age;

    Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    void displayDetails() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
}


public class constructorExample {
    public static void main(String[] args) {
        Student s1 = new Student("Sid", 23);
        Student s2 = new Student("Sara", 21);

        s1.displayDetails();
        s2.displayDetails();
    }
}
