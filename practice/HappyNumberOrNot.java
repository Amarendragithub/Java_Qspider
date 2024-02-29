package practice;

public class HappyNumberOrNot {

	public static void main(String[] args) {
		int n=13;
		while(true) {
			int sum=0;
			while(n>0) {
				int d=n%10;
				sum=sum+d*d;
				n=n/10;
			}
			if(sum==1) {
				System.out.println("Happy number");
				break;
			}
			else if(sum==4) {
				System.out.println("not happy number");
				break;
			}
			n=sum;
		}

	}

}
