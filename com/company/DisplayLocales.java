package com.company;
import java.util.Locale;

/**
 * displays all available locales
 */
public class DisplayLocales {

        public  DisplayLocales(){
            Locale available[]=Locale.getAvailableLocales();
            for(Locale locale : available) {
                System.out.println(locale.toString()+" "+locale.getDisplayName()+" "+ locale.getDisplayCountry()+" "+locale.getDisplayLanguage(locale));
            }
        }


}
