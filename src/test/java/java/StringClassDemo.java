package java;

public class StringClassDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// 2 Ways we can declare a string
		
		// 1. String Literally
		String a = "name";
		String b = "name";
		
		// 2. By creating object of string
		String a1 = new String("Fullname");
		String b1 = new String("Fullname");
		
		
	System.out.println(a.charAt(2));							// To get the character at index 2
	System.out.println(b.indexOf("m"));							// To get the index of character m
	System.out.println(a1.substring(2, 5));						// To get the string characters from 2 to 5
	System.out.println(b1.substring(4));						// To get the string from character 4 to end
	System.out.println(a.concat(b1));							// To combine 2 strings
	System.out.println(a.trim());								// To remove space at starting
	System.out.println(a1.toUpperCase());						// To convert to upper case
	System.out.println(b1.toLowerCase());						// To convert to lower case
	String arr[]=	a1.split("u");								// To separate by using letter u
	System.out.println(arr[0]);									// To get the first index of separated
	System.out.println(arr[1]);									// To get the second index of separated
	System.out.println(a1.replace("l", "s"));					// To replace letter l with s	
		
	}

}
