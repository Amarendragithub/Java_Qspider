package programming;

import java.util.Scanner;

public class BuzzNumber6 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the numeber");
		int num=sc.nextInt();
		if(num%7==0||num%10==7) {
			System.out.println(num+" is a Buzz number");
		}
		else {
			System.out.println(num+" is not a buzz number");
		}


	}

}
