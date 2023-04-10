import java.util.Enumeration;
import java.util.Locale;
import java.util.ResourceBundle;
import java.util.spi.LocaleServiceProvider;

public class Test {
    public static void main(String[] args){
        Locale ru = new Locale("ru");
        Locale en = new Locale("en");

        for (int i = 1; i< 9; i++){
            System.out.println(ResourceBundle.getBundle("test", ru).getString("key" + i));

        }

        for (int i = 1; i< 9; i++){
            System.out.println(ResourceBundle.getBundle("test", en).getString("key" + i));

        }



    }
}
