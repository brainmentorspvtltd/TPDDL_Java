package utils;
import java.text.DateFormat;
import java.text.NumberFormat;
import java.util.Date;
import java.util.Locale;

public class Format {
	private Format() {
		
	}
	public static String titleCase(String name) {
		return String.valueOf(name.charAt(0)).toUpperCase()+name.substring(1).toLowerCase();
	}
	public static String getDate() {
		Date d = new Date();
		DateFormat df = DateFormat.getDateInstance(DateFormat.SHORT);
		return  df.format(d);
	}
	public static String formatNumber(double value) {
		Locale locale = new Locale("en", "US");
		NumberFormat nf = NumberFormat.getCurrencyInstance(locale);
		return nf.format(value);
	}
}
