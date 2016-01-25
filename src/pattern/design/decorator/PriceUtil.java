package pattern.design.decorator;

import java.text.NumberFormat;
import java.util.Locale;

/**
 * Created by ykhdzr on 1/25/16.
 */
public class PriceUtil {

    private PriceUtil() {
        /* cannot be instantiated */
        throw new UnsupportedOperationException("cannot be instantiated");
    }

    public static String getPriceByLocale(long totalPrice) {
        final String LANGUAGE = "ca";
        final String COUNTRY = "CA";
        final String REMOVED_STRING = "CAD";
        final String REMOVE_COMMA_ZERO = ",00";
        Locale locale = new Locale(LANGUAGE, COUNTRY);
        NumberFormat rupiahFormat = NumberFormat.getCurrencyInstance(locale);
        return "Rp " + rupiahFormat.format(totalPrice).replace(REMOVED_STRING, "").replace(REMOVE_COMMA_ZERO, "");
    }
}
