package Regualar_exp;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class emailValid {
	public static void main(String[] args) {
		int count=0;
		String str="sudar12@gmail.com";
		Pattern p = Pattern.compile("\\s");
		Matcher m = p.matcher(str);
		while (m.find()) {
			count++;
		}
		if(count==0 && str.length()>15 &&
			(str.endsWith("@gmail.com") ||
			 str.endsWith("@email.com"))  ) {
			System.out.println("valid");
		}else {
			System.out.println("ERROR");
		}
	}
}
