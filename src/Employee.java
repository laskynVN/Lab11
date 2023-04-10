public class Employee {
    private double salary;
    private String fullName;

    public Employee(String fullName, double salary) {
        this.salary = salary;
        this.fullName = fullName;
    }

    public String getFullName() {
        return fullName;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    @Override
    public String toString() {
        return "Полное имя: " + fullName + "\n"
                + "Зарплата: " + salary;
    }
}
