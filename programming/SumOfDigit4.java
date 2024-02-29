package programming;

import java.util.Scanner;

public class SumOfDigit4 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the numeber");
		int num=sc.nextInt();
		int sum=0;
		while(num>0)
		{
			int a=num%10;
			sum=sum+a;
			num=num/10;
		}
		System.out.println(sum);


	}

}
