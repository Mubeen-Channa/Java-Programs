import java.util.Scanner;

class Student {
    private String name, department;
    private int id;

    // Setter for name with validation
    void setName(String name) {
        if (name.length() >= 3 && name.length() <= 20) {
            this.name = name;
        } else {
            System.out.println("Name must be between 3 and 20 characters.");
        }
    }

    // Setter for department
    void setDepartment(String department) {
        this.department = department;
    }

    // Setter for ID
    void setId(int id) {
        this.id = id;
    }

    // Getter for name
    String getName() {
        return name;
    }

    // Getter for department
    String getDepartment() {
        return department;
    }

    // Getter for ID
    int getId() {
        return id;
    }
}

public class SetterGetter {
    public static void main(String[] args) {
        Scanner enter = new Scanner(System.in);

        Student obj = new Student();
        Student obj2 = new Student();

        System.out.print("Enter the Name of the student : ");
        String name = enter.nextLine();

        obj.setName(name);
        obj.setDepartment("Cs");
        obj.setId(12345);

        // Output the details of obj
        System.out.println("\nStudent 1 Details:");
        System.out.print(obj.getName() + "\t");
        System.out.print(obj.getDepartment() + "\t");
        System.out.print(obj.getId() + "\t");

        // Set and output the details of obj2
        obj2.setName("Ahmed");
        obj2.setDepartment("BBA");
        obj2.setId(54321);

        System.out.println("\nStudent 2 Details:");
        System.out.print(obj2.getName() + "\t");
        System.out.print(obj2.getDepartment() + "\t");
        System.out.print(obj2.getId() + "\t");

        enter.close();  // Close scanner
    }
}
