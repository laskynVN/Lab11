import java.util.Locale;
import java.text.NumberFormat;
import java.util.ResourceBundle;
class Report {
    public static void generateReport(Employee[] employees, Locale locale) {
        ResourceBundle bundle = ResourceBundle.getBundle("Task2", locale);
        NumberFormat currency = NumberFormat.getCurrencyInstance(locale);
        System.out.printf("|        %s      | %s|%n", bundle.getString("name"), bundle.getString("salary"));
        for (Employee employee : employees) {
            String[] names = employee.getFullName().split("\\s+");
            String formattedSalary = currency.format(employee.getSalary());
            System.out.printf("|  %s.%s. %-15s|%12s|%n", names[1].substring(0, 1), names[2].substring(0, 1), names[0], formattedSalary);
        }
    }
}
