package Regualar_exp;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class A {
	public static void main(String[] args) {
		Pattern p1=Pattern.compile("\\s");
		System.out.println("\\s only space");
		Matcher m1 = p1.matcher("a2B c@# l 9E");
		while (m1.find()) {
			System.out.println(m1.start() + "...." + m1.group());
		}
		System.out.println("\n\\S except sapce");
		Pattern p2=Pattern.compile("\\S");
		Matcher m2 = p2.matcher("a2B c@# l 9E");
		while (m2.find()) {
			System.out.println(m2.start() + "...." + m2.group());
		}
		System.out.println("\n\\d only digit");
		Pattern p3=Pattern.compile("\\d");
		Matcher m3 = p3.matcher("a2B c@# l 9E");
		while (m3.find()) {
			System.out.println(m3.start() + "...." + m3.group());
		}
		System.out.println("\n\\D except digit");
		Pattern p4=Pattern.compile("\\D");
		Matcher m4 = p4.matcher("a2B c@# l 9E");
		while (m4.find()) {
			System.out.println(m4.start() + "...." + m4.group());
		}
		System.out.println("\n\\w except special char");
		Pattern p5=Pattern.compile("\\w");
		Matcher m5 = p5.matcher("a2B c@# l 9E");
		while (m5.find()) {
			System.out.println(m5.start() + "...." + m5.group());
		}
		System.out.println("\n\\W except lower/Upper case & digit");
		Pattern p6=Pattern.compile("\\W");
		Matcher m6 = p6.matcher("a2B c@# l 9E");
		while (m6.find()) {
			System.out.println(m6.start() + "...." + m6.group());
		}
		
	
	}
}
