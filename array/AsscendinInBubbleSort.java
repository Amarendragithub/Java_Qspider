package array;

import java.util.Arrays;
import java.util.Scanner;

public class AsscendinInBubbleSort {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the array size ");
		int size=sc.nextInt();
		
		int a[]=new int[size];
		System.out.println("Enter the array elements");
		for(int i=0;i<a.length;i++) {
			a[i]=sc.nextInt();
		}
		for(int i=0;i<a.length;i++) {
			for(int j=0;j<a.length-1;j++) {
				if(a[j]>a[j+1]) {
					int temp=a[j];
					a[j]=a[j+1];
					a[j+1]=temp;
				}
				System.out.println(Arrays.toString(a));
				
			}
		}
		System.out.println("After sorting array");
		for(int i=0;i<a.length;i++) {
			System.out.println(a[i]);
		}
		

	}

}
