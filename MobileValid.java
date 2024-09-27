package Regualar_exp;

import java.util.Scanner;

public class MobileValid {
public static void main(String[] args) {
	System.out.println("enter number: ");
	Scanner s = new Scanner(System.in);
	String str = s.next();
	String regex ="[6-9][0-9]{9}";
	if(str.matches(regex)) {
		System.out.println("valid");
	}else {
		System.out.println("invalid");
	}
	s.close();
}
}
