package programming;

import java.util.Scanner;

public class PrimeOfRange12 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the starting range");
		int sr=sc.nextInt();
		int sum=0;
		System.out.println("Enter the ending range");
		int er=sc.nextInt();
		for(int i=sr;i<=er;i++) {
			int count=0;
			for(int j=1;j<=i;j++) {
				if(i%j==0) {
					count++;
				}
			}
			if(count==2) {
				//System.out.println(i);
				sum=sum+i;
				System.out.println(sum);
			}
		}


	}

}
