package array;

import java.util.Scanner;

public class SecondMaximumElement {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the array size ");
		int size=sc.nextInt();
		
		int a[]=new int[size];
		System.out.println("Enter the array elements");
		for(int i=0;i<a.length;i++) {
			a[i]=sc.nextInt();
		}
		int min=a[0];
		for(int i=0;i<a.length;i++) {
			if(a[i]<min) {
				min=a[i];

			}
		}
		int max=min,secondmax=0;
		for(int i=0;i<a.length;i++) {
			if(a[i]>max) {
				secondmax=max;
				max=a[i];
			}
				else if(a[i]>secondmax&&a[i]!=max) {
					secondmax=a[i];
				}
			
		}
		System.out.println("Maximum element array is: "+max);
		System.out.println("Second maximum element array is: "+secondmax);
		

	}

}
