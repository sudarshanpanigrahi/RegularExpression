package Regualar_exp;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class nameValid {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("enter your name: ");
		String str =s.next();
		int count=0;
		Pattern p = Pattern.compile("[^a-zA-Z]");
		Matcher m = p.matcher(str);
		while (m.find()) {
			count++;
		}
		if(count!=0 || str.length()<3) {
			System.out.println("ERROR");
		}else {
			System.out.println("Accepeted");
		}
		s.close();
	}
}
