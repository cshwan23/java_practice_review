package com.zzz.erp;

import java.util.regex.Pattern;

public class StringTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a = 10;
		int b = 10;
		
		System.out.println(a==b);
		
		
		String str4 = "Beatles";
		String str5 = "BEATLES";
		
		System.out.println("str4==str5 => "+ (str4==str5));
		System.out.println("str4.equals(str5) => " + str4.equals(str5));
		
		System.out.println(str4.equalsIgnoreCase(str5));

		
		String str = "This is a love";
		
	
		System.out.println(str.charAt(5));
		System.out.println(str.concat(" girl"));
		System.out.println(str+" girl");
		
		System.out.println(str.startsWith("This"));
		System.out.println(str.endsWith("love"));
		System.out.println("----------------");
		System.out.println(str.indexOf("i"));
		System.out.println(str.indexOf("i",3));
		System.out.println(str.indexOf("is"));
		System.out.println(str.indexOf("is",5));
		
		System.out.println(str.length());
		System.out.println(str.replace("i", "I"));
		System.out.println(str.replaceFirst("is", "IS"));
		System.out.println(str.substring(5,13));
		System.out.println(str.substring(5,7));
		System.out.println(str.substring(5));
		
		System.out.println(str.toLowerCase());
		System.out.println(str.toUpperCase());
		
		
		String phone = "010-1234-1234";
		String num = "0123456789-";
	
		boolean result = true;
		
		if(phone.length()!=13) {
			result =false;
			
		}else {
			
			for(int i = 0; i<phone.length(); i++) {
				
				char xxx = phone.charAt(i);
			
				if(i<3||(i>=4&&i<=7)||(i>=9)) {
					
					if(num.indexOf(xxx)<0) {
						result = false;
						break;
					}
				}
				if(i==3||i==8) {
					if(xxx!='-') {
						result =false;
						break;
					}
				}
			}
			
		}
		if(result==true) {
			System.out.println("전번으로 합당하다.");
		}else {
			System.out.println("전번으로 맞지 않다.");
		}
		
	boolean result2 = Pattern.matches("[0-9]{3}-[0-9]{4}-[0-9]{4}", phone);
	if(result2==true) {
		System.out.println("전번으로 합당하다.");
	}else {
		System.out.println("전번으로 맞지 않다.");
	}
		
	}
}








