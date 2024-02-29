package practice;

import java.util.Scanner;

public class GreatestCommonDivision4 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the 1st number");
		int a=sc.nextInt();
		System.out.println("Enter the 2nd number");
		int b=sc.nextInt();
		System.out.println("The greatest common division is:");
		int gcd=1;
		for(int i=1;i<=a &&i<=b;i++) {
			if(a%i==0 && b%i==0) {
				gcd=i;
			}
		}
		System.out.println(gcd);

	}

}
