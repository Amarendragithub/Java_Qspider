package array;

import java.util.Scanner;

public class InsertAnElement {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the array size ");
		int size=sc.nextInt();
		
		int a[]=new int[size];
		System.out.println("Enter the array elements");
		for(int i=0;i<a.length;i++) {
			a[i]=sc.nextInt();
		}
		int b[]=new int[a.length+1];
		int count=0;
		int ele=2;
		int ind=1;
		
		for(int i=0;i<b.length;i++) {
			if(i==ind) {
				b[i]=ele;
			}else {
				b[i]=a[count];
				count++;
			}
		}
		System.out.println("After inserting element:");
		for(int i=0;i<b.length;i++) {
			System.out.println(b[i]);
				
			}
		}

	}


