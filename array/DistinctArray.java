package array;

import java.util.Scanner;

public class DistinctArray {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the array size ");
		int size=sc.nextInt();
		
		int a[]=new int[size];
		int m=Integer.MIN_VALUE;
		System.out.println("Enter the array elements");
		for(int i=0;i<size;i++) {
			a[i]=sc.nextInt();
		}
		System.out.println("Distinct value");
		for(int i=0;i<a.length;i++) {
			int count=0;
			for(int j=0;j<a.length;j++) {
				if(a[i]==a[j]) {
					count++;
				}
			}
			if(count==1) {
				System.out.println(a[i]);
			}
				
			}
	//	System.out.println(Integer.MIN_VALUE);
		
	

	}

}
