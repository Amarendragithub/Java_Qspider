package practice;

import java.util.Scanner;

public class PowerOfNumber3 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		int num=sc.nextInt();
		int pow=1,p=3;
		for(int i=1;i<=p;i++) {
			pow=pow*num;
		}
		//System.out.println(num+" of "+p+" power is "+pow);
		System.out.println(pow);

	}

}
