class Student2 {
    int id;
    String name;

    // Parameterized constructor
    Student2(int i, String n) {
        id = i;
        name = n;
    }

    // Method to display the values
    void display() {
        System.out.println(id + " " + name);
    }

    public static void main(String args[]) {
        // Creating objects and passing values
        Student2 s1 = new Student2(111, "Karan");
        Student2 s2 = new Student2(222, "Aryan");

        // Calling the method to display the values of objects
        s1.display();
        s2.display();
        }
    }