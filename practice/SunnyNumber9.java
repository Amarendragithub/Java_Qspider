package practice;

import java.util.Scanner;

public class SunnyNumber9 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the numeber");
		int n = sc.nextInt();
		int n1=n+1;
		for(int i=1;i<n1;i++) {
			if(i*i==n1) {
				System.out.println(n+" is a sunny number");
				break;
			}
			else if(i==n) {
				System.out.println(n+" is not a sunny number");
			}
		}
		

	}

}
