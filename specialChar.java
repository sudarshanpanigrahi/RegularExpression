package Regualar_exp;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class specialChar {
	public static void main(String[] args) {
		Pattern p = Pattern.compile("[^a-zA-Z0-9]");
		Matcher m = p.matcher("ch2@k$ZN%3&H");
		while (m.find()) {
			System.out.println(m.start() + "...." + m.group());
		}
	}
}
