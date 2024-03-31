package array;

import java.util.Scanner;

public class AverageOfArray {

	public static void main(String[] args) {
		int sum=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the array size ");
		int size=sc.nextInt();
		
		int a[]=new int[size];
		System.out.println("Enter the array elements");
		for(int i=0;i<a.length;i++) {
			a[i]=sc.nextInt();
		}
		
		for(int i=0;i<a.length;i++) {
			sum=sum+a[i];
				
			}
		int avg=sum/a.length;
		System.out.println(avg);
		}
	


	}


