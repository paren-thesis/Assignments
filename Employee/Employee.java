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

    public double salaryIncrease() {
        return basicSalary * 0.05;
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

    public double EmployeePf() {
        return 0.05 + getBasicSalary();
    }

    public double salaryAllowance() {
        return 300;
    }

    public double netSalary() {
        return (getBasicSalary() + salaryAllowance()) - EmployeePf();
    }

    public static void main(String[] args) {
        // Scanner input = new Scanner(System.in);
        Employee user = new Employee("Gifty", "Osei", 5000);
        System.out.println(user.getFirstName());
    }

}