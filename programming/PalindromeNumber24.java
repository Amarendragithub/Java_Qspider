package programming;

public class PalindromeNumber24 {

	public static void main(String[] args) {
		int copy,rev=0;
		int n=151;
		copy=n;
		while(n>0)
		{
			int rem=n%10;
			rev=rev*10+rem;
			n=n/10;
		}
		if(copy==rev)
		{
			System.out.println(copy+" is the palindrome number");
		}else {
			System.out.println(copy+" is not palindrome number");
		}

	}

}
