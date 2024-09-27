package Regualar_exp;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class SpecificDigit {
	public static void main(String[] args) {
		Pattern p = Pattern.compile("[0-9]{10}");
		Matcher m = p.matcher("9348826585,9777761095");
		while (m.find()) {
			System.out.println(m.start() + "...." + m.group());
		}
	}
}
