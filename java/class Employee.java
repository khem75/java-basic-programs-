// Parent class
class Employee {
    void salary() {
        System.out.println("Salary is paid to the employee");
    }
}

// Child class
class HR extends Employee {
    void bonus() {
        System.out.println("Bonus is paid to the HR employee");
    }
}

public class Inheritance{ // Class name changed to start with a capital letter
    public static void main(String[] args) {
        HR obj = new HR();
        obj.salary(); // Inherited from Employee class
        obj.bonus(); // Specific to HR class
    }
}
