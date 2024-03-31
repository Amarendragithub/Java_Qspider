package array;

import java.util.Arrays;
import java.util.Scanner;

public class BinarySearch {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the array size ");
		int size=sc.nextInt();
		
		int a[]=new int[size];
		System.out.println("Enter the array elements");
		for(int i=0;i<a.length;i++) {
			a[i]=sc.nextInt();
		}
		Arrays.sort(a);
		System.out.println("Enter the key value:");
		int key=sc.nextInt();
		int l=0,h=a.length-1,mid=0;
		boolean flag=false;
		while(l<=h) {
			mid=(l+h)/2;
			if(key==a[mid]) {
				flag=true;
				System.out.println("element is found");
				break;
			}
			else if(key<a[mid]) {
				h=mid-1;
			}
			else if(key>a[mid]) {
				l=mid+1;
			}
		}
		if(flag==false) {
			System.out.println("element is not found");
		}

	}

}
