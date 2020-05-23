package app;
import com.company.DisplayLocales;
import com.company.Info;
import com.company.SetLocale;
import java.util.Locale;
import java.util.Scanner;

/**
 * the main app
 * it reads commands from the keyboard and executes them, commands like set, display and info
 * display command- displays all the available locales
 * set command- asks for 2 more variables: language and country and changes the default locale
 * info command- displays information about the current locale
 */
public class LocaleExplore {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while(true){
            System.out.println("\nWaiting for a command... ");
            String command=scanner.nextLine();
            if(command.equals("display")){
                DisplayLocales locales=new DisplayLocales();
            }
            if(command.equals("set")){
                System.out.println("Insert language: ");
                String language=scanner.nextLine();
                System.out.println("Insert country: ");
                String country=scanner.nextLine();
                Locale locale=new Locale(language,country);
                SetLocale loca=new SetLocale(locale);

            }
            if(command.equals("info")){
                Info info= new Info();
            }
        }
    }
}
