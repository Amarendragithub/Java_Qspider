package array;

import java.util.Scanner;

public class LinearSearch {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the array size ");
		int size=sc.nextInt();
		
		int a[]=new int[size];
		System.out.println("Enter the array elements");
		for(int i=0;i<a.length;i++) {
			a[i]=sc.nextInt();
		}
		System.out.println("Enter the array which you want");
		int target=sc.nextInt();
		boolean flag=false;
		for(int i=0;i<a.length;i++) {
			if(target==a[i]) {
				flag=true;
				System.out.println("The given element is present in the array: "+i);
				break;
			}
		}
		if(flag==false) {
			System.out.println("The given element is not present in the array");
		}

	}

}
