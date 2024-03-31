package array;

import java.util.Scanner;

public class PalindromeApproach2 {

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
		int count1=a.length-1;
		boolean flag=false;
		
		while(count<count1) {
			if(a[count]==a[count1]) {
				flag=true;
				count++;
				count1--;
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
