package array;

import java.util.Scanner;

public class PalindromeArray {

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
		for(int i=0;i<a.length;i++) {
			System.out.println(b[i]);
		}
		boolean flag=false;
		for(int i=0;i<a.length;i++) {
			if(a[i]==b[i]) {
				flag=true;
			}else {
				flag=false;
				break;
			}
		}
		if(flag==true) {
			System.out.println("palindrome array");
		}else {
			System.out.println("not palindrome array");
		}

	}

}
