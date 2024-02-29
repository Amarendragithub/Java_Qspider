package practice;

import java.util.Scanner;

public class SquareOfRoot8 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the numeber");
		int num = sc.nextInt();
		for (int i = 1; i <= num; i++) {
			if (i * i == num) {
				System.out.println("The square of root is " + i);
				break;
			}
			else if(i==num) {
				System.out.println("this number is no square root");
			}

		}
		

	}

}
