package array;

import java.util.Scanner;

public class PrimeArray {

	public static void main(String[] args) {
		boolean flag=false;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the array size ");
		int size=sc.nextInt();
		
		int a[]=new int[size];
		System.out.println("Enter the array elements");
		for(int i=0;i<a.length;i++) {
			a[i]=sc.nextInt();
		}
		
		for(int i=0;i<a.length;i++) {
			int count=0;
			//int num=a[i];
			for(int j=1;j<=a[i];j++) {
				if(a[i]%j==0) {
					count++;
				}
			}
			if(count==2) {
				System.out.println(a[i]);
				flag=true;
			}
				
			}
		if(flag==false) {
			System.out.println("prime no is not preasent");
		}
		

	}

}
