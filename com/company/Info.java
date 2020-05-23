package com.company;
import java.text.DateFormatSymbols;
import java.util.Currency;
import java.util.Locale;

/**
 * displays information about the current locale
 */
public class Info {
    Locale locale;
    public Info() {
        this.locale = Locale.getDefault();
        System.out.println("Country: " + this.locale.getDisplayCountry());
        System.out.println("Language: " + this.locale.getDisplayLanguage());
        System.out.println("Currency: " + Currency.getInstance(this.locale));
        String[] weekdays = new DateFormatSymbols(this.locale).getWeekdays();
        System.out.print("Week Days: ");
        for (String days : weekdays) {
            System.out.print(days+", ");
        }
        String[] months = new DateFormatSymbols(this.locale).getMonths();
        System.out.println("");
        System.out.print("Months: ");
        for (String month : months) {
            System.out.print(month+", ");

        }

    }
}
