package placement_practice;

public class PalindromeString {

	public static void main(String[] args) {
		String s="abca";
		String rev="";
		for(int i=s.length()-1;i>=0;i--) {
			rev=rev+s.charAt(i);
		}
		System.out.println(rev);
		if(s.equalsIgnoreCase(rev)) {
			System.out.println("is palindrome no");
		}
		else {
			System.out.println("not a palindrome");
		}

	}

}
