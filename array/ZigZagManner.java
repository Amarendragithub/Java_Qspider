package array;

import java.util.Scanner;

public class ZigZagManner {

	public static void main(String[] args) {
		int count=0,count1=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the array size ");
		int size1=sc.nextInt();
		int a[]=new int[size1];
		int size2=sc.nextInt();
		int b[]=new int[size2];
		int size3=size1+size2;
		int c[]=new int[size3];
		System.out.println("Enter the 1st array elements");
		for(int i=0;i<a.length;i++) {
			a[i]=sc.nextInt();
		}
		System.out.println("Enter the 2nd array elements");
		for(int i=0;i<b.length;i++) {
			b[i]=sc.nextInt();
				
			}
		for(int i=0;i<c.length;) {
			if(count<a.length) {
				c[i]=a[count];
				count++;
				i++;
			}
			if(count1<b.length) {
				c[i]=b[count1];
				count1++;
				i++;
			}
				
			}
		
//		int i=0;
//		while(i<c.length) {
//		if(count<a.length) {
//			c[i]=a[count];
//			count++;
//			i++;
//		}
//     	if(count1<b.length) {
//			c[i]=b[count1];
//			count1++;
//			i++;
//		}
//		}
		
		System.out.println("zigzag array is:");
		for(int i=0;i<c.length;i++) {
			System.out.println(c[i]);
				
			}
		

	}

}
