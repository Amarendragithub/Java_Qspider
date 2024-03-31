package array;

import java.util.Scanner;

public class CopyArray {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the array size ");
		int size=sc.nextInt();
		
		int a[]=new int[size];
		int b[]=new int[size];
		System.out.println("Enter the array elements");
		for(int i=0;i<size;i++) {
			a[i]=sc.nextInt();
		}
		
		for(int i=0;i<size;i++) {
			b[i]=a[i];
				
			}
		System.out.println("After copy array element");
		for(int i=0;i<size;i++) {
			System.out.println(b[i]);
				
			}
		
	

	}

}
