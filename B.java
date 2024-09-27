package Regualar_exp;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class B {
	public static void main(String[] args) {
		Pattern p = Pattern.compile("\\b\\w+\\b");
		Matcher m = p.matcher("hey monty hello");
		while (m.find()) {
			System.out.println(m.group());
		}
	}

}
