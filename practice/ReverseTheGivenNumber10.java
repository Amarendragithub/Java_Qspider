package practice;

import java.util.Scanner;

public class ReverseTheGivenNumber10 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the numeber");
		int n = sc.nextInt();
		int rev=0;
		while(n>0)
		{
			int rem=n%10;
			rev=rev*10+rem;
			n=n/10;
		}
		System.out.println(rev);

	}

}
