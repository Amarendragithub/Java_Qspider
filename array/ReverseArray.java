package array;

import java.util.Scanner;

public class ReverseArray {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the array size ");
		int size=sc.nextInt();
		
		int a[]=new int[size];
		System.out.println("Enter the array elements");
		for(int i=0;i<a.length;i++) {
			a[i]=sc.nextInt();
		}
		int b[]=new int[size];
		int count=0;
		for(int i=a.length-1;i>=0;i--) {
			b[count]=a[i];
			count++;
		}
		System.out.println("Reverse array element:");
		for(int i=0;i<a.length;i++) {
			System.out.println(b[i]);
		}
		

	}

}
