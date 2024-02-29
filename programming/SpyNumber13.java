package programming;

import java.util.Scanner;

public class SpyNumber13 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		int num=sc.nextInt();
		int sum=0,prd=1;
		while(num>0) {
			int rem=num%10;
			sum=sum+rem;
			prd=prd*rem;
			num=num/10;
		}
		if(sum==prd) {
			System.out.println("it is the spy number");
		}
		else {
			System.out.println("it is not a spy number");
		}


	}

}
