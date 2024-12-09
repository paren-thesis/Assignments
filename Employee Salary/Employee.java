import java.util.Scanner;

public class Employee {
    public String firstName;
    public String lastName;
    public double basicSalary;

    public Employee(String firstName, String lastName, double basicSalary) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.basicSalary = basicSalary;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public double getBasicSalary() {
        return basicSalary;
    }

    public void setBasicSalary(double basicSalary) {
        this.basicSalary = basicSalary;
    }

    public double salaryIncrease() {
        double increase = getBasicSalary() * 0.05;
        return basicSalary + increase;
    }

    public double employeePF() {
        return 0.5 * getBasicSalary();
    }

    public double salayAllowance() {
        return 300;
    }

    public double netSalary() {
        return getBasicSalary() + salayAllowance() + employeePF();
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter your first name: ");
        String fname = input.nextLine();
        System.out.println("Enter your lastname");
        String lname = input.nextLine();
        System.out.println("Enter your salary");
        double salary = input.nextDouble();


        Employee worker = new Employee(fname, lname, salary);

        String name = String.format("Mr/Mrs %S %S", fname, lname);

        System.out.printf("Dear %S your basic salary is GHC %5.2f\n",name, worker.getBasicSalary());
        System.out.printf("The net salary is GHC %5.2f\n", worker.netSalary());
        System.out.printf("Salary bonus GHC %5.2f", worker.salaryIncrease());


    }
}