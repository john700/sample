package com;

import java.util.regex.Pattern;

public class StringDigits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String regex="\\d+";
		Pattern pattern=Pattern.compile(regex);
		String a="12a34";
		boolean b=false;
		
		
		b=pattern.matcher(a).matches();
		System.out.println(b);
		

	}

}
