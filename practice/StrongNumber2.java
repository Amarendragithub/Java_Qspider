package practice;

import java.util.Scanner;

public class StrongNumber2 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		int num=sc.nextInt();
		int sum=0;
		int temp=num;
		while(num>0) {
		int d=num%10;
		int fact=1;
		for(int i=d;i>=1;i--) {
			fact=fact*i;
		}
		sum=sum+fact;
		num=num/10;
		}
		if(temp==sum)
		{
			System.out.println(temp+" is a strong number");
		}else {
			System.out.println(temp+" is not a strong number");
		}

	}
		

}
