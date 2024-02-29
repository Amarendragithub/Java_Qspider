package practice;

public class AutoMorphicNumber {

	public static void main(String[] args) {
		int n=4;
		int sq=n*n;
		while(n>0) {
			if(n%10==sq%10) {
				n=n/10;
				sq=sq/10;		
		}
			else {
				break;}
			}
		if(n==0) {
			System.out.println("Automorphic number");
		}
		else {
			System.out.println(" not Automorphic number");
		}

	}

	}

