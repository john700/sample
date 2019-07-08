package com;

import java.util.Arrays;

import sun.security.util.Length;

public class StringReverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		String s1="john";
		char []c1=s1.toCharArray();
		char []c2=new char[s1.length()];
		String result="";
		
		for(int i=0;i<c1.length;i++){
			result+=c1[c1.length-1-i];
		}
		
		System.out.println(reverseString("john"));
	}
	
	public static String reverseString1(String s1){
		if(s1.length()<2)
			return s1;
		
			return(reverseString(s1.substring(1)+s1.charAt(0)));
		
		
	}
	
	public static String reverseString(String myStr)
	{
		if (myStr.isEmpty()){
		 System.out.println("String in now Empty");	
		 return myStr;
		}
		//Calling Function Recursively
		System.out.println("String to be passed in Recursive Function: "+myStr.substring(1));
		return reverseString(myStr.substring(1)) + myStr.charAt(0);
	}

}
