package practice;

import java.util.Scanner;

public class SumOfPrimeNumberBetweenRange6 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the 1st number");
		int n1=sc.nextInt();
		System.out.println("Enter the lat number");
		int n2=sc.nextInt();
		System.out.println("Sum of the factor is:");
		int sum=0;
		for(int i=n1;i<=n2;i++) {
			int num=i;
			int count=0;
			for(int j=1;j<=num;j++) {
				if(num%j==0) {
					count++;
				}
			}
			if(count==2) {
				sum=sum+num;
			}
		}
		System.out.println(sum);

	}

}
