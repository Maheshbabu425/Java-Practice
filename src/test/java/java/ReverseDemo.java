package java;

public class ReverseDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String name = "Mahesh";
		String kalluri = "";

		for (int i = name.length() - 1; i >= 0; i--) {
			kalluri = kalluri + name.charAt(i);
		}
		System.out.println(kalluri);

		// Palindrome
		String s = "madam";
		String t = "";
		for (int j = s.length() - 1; j >= 0; j--) {
			t = t + s.charAt(j);						// charAt method used for reverse the string
		}
		System.out.println(t);
		if (s == t) {
			System.out.println("It is palindrome");
		}

	}
}
