package array;

import java.util.Scanner;

public class RemoveAnElement {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the array size ");
		int size=sc.nextInt();
		
		int a[]=new int[size];
		System.out.println("Enter the array elements");
		for(int i=0;i<a.length;i++) {
			a[i]=sc.nextInt();
		}
		int b[]=new int[a.length-1];
		int count=0;
		int ind=2;
		if(ind>=0&&ind<a.length) {
		for(int i=0;i<a.length;i++) {
			if(i!=ind) {
				b[count++]=a[i];
			}
		}
		System.out.println("After removing element:");
		for(int i=0;i<b.length;i++) {
			System.out.println(b[i]);
				
			}
		}
		else {
			System.out.println("index value is not found");
		}


	}

}
