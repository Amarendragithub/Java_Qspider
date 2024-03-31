package array;

import java.util.Scanner;

public class EvenElementsArray {

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
			if(a[i]%2==0) {
				System.out.println(a[i]);
				flag=true;
			}
		}
		if(flag==false) {
			System.out.println("Element is not preasent");
		}


	}

}
