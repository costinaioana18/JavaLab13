package com.company;
import java.util.Locale;

/**
 * sets the application current locale.
 */
public class SetLocale {

        public SetLocale(Locale locale){
            Locale.setDefault(locale);
        }
}
