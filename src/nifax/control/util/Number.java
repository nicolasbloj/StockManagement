package nifax.control.util;

import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;


/**
 *
 * @author NB
 */
public class Number {

    public static DecimalFormat formateator;

    static {
        try {
            DecimalFormatSymbols otherSymbols = new DecimalFormatSymbols();
            otherSymbols.setDecimalSeparator('.');
            formateator = new DecimalFormat("#######.##", otherSymbols);
        } catch (Throwable ex) {
            System.err.println("Failed to create sessionFactory object." + ex);
            throw new ExceptionInInitializerError(ex);
        }
    }

    public static Long stringToLong(String s) {
        if (s.trim().length() > 0) {
            return Long.parseLong(s);
        } else {
            return null;
        }
    }

}
