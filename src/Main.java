import java.io.UnsupportedEncodingException;
import java.util.Locale;
import java.util.ResourceBundle;

public class Main
{
    private static void printInfo(String language, String country)
            throws UnsupportedEncodingException {
        Locale current = new Locale(language, country);
        ResourceBundle rb = ResourceBundle.getBundle("Task1", current);
        for (String key : rb.keySet()) {
            String value = rb.getString(key);
            System.out.println(value);
        }
        System.out.println();
    }
    public static void main(String[] args) throws UnsupportedEncodingException {
        printInfo("en", "US");
        printInfo("ru", "RU");
        Employee[] employees = {
                new Employee("Иванов Иван Иванович", 4500),
                new Employee("Никитин Никита Никитьевич", 4600),
                new Employee("Егоров Егор Егорович", 2150),
                new Employee("Васильев Василий Васильевич", 2700),
                new Employee("Чингисхан Чигин Чимин", 3685),
        };
        Report.generateReport(employees, new Locale("en", "US"));
        Report.generateReport(employees, new Locale("ru", "RU"));
    }
}
