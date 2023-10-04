class Student1 {
    int id;
    String name;

    // Default constructor
    Student1() {
        id = 0;
        name = null;
    }

    // Method to display the values
    void display() {
        System.out.println(id + " " + name);
    }

    public static void main(String args[]) {
        // Creating objects
        Student1 s1 = new Student1();
        Student1 s2 = new Student1();

        // Displaying values of the objects
        s1.display();
        s2.display();
        }
    }