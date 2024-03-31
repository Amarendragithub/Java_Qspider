package array;

import java.util.Scanner;

public class PrintDuplicateApproach2 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the array size ");
		int size=sc.nextInt();
		
		int a[]=new int[size];
		System.out.println("Enter the array elements");
		for(int i=0;i<size;i++) {
			a[i]=sc.nextInt();
		}
		System.out.println("Duplicate value");
		for(int i=0;i<a.length;i++) {
			int count=0;
			for(int j=i+1;j<a.length;j++) {
				if(a[i]==a[j]) {
					count++;
					a[j]=-1;
				}
			}
			if(count>=1&&a[i]!=-1) {
				System.out.println(a[i]);
			}
				
			}


	}

}
