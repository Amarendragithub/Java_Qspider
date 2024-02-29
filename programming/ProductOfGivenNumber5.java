package programming;

import java.util.Scanner;

public class ProductOfGivenNumber5 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the numeber");
		int num=sc.nextInt();
		int prd=1;
		while(num>0)
		{
			int a=num%10;
			prd=prd*a;
			num=num/10;
		}
		System.out.println(prd);


	}

}
