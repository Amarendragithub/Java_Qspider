package programming;

import java.util.Scanner;

public class EvenNumber1 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the numeber");
		int num=sc.nextInt();
		if(num%2==0)
		{
			System.out.println("The given number is even number");
		}
		else {
			System.out.println("The given number is not even number");
		}

	}

}
