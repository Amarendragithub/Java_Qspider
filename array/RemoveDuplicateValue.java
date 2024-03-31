package array;

import java.util.Scanner;

public class RemoveDuplicateValue {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the array size ");
		int size=sc.nextInt();
		
		int a[]=new int[size];
		System.out.println("Enter the array elements");
		for(int i=0;i<size;i++) {
			a[i]=sc.nextInt();
		}
		System.out.println("After remove duplicate element:");
		for(int i=0;i<size;i++) {
			int count=0;
			for(int j=i;j<size;j++) {
				if(a[i]==a[j]) {
					count++;
				}
			}
			if(count==1) {
				System.out.println(a[i]);
			}
				
			}

	}

}
