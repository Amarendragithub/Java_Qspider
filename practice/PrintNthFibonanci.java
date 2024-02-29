package practice;

public class PrintNthFibonanci {

	public static void main(String[] args) {
		int n=6,a=0,b=1,c=0;
//		for(int i=1;i<=n;i++) {
//			if(n==i) {
//			System.out.println(a);
//			}
//			c=a+b;
//			a=b;
//			b=c;
//		}
		for(int i=1;i<n;i++) {
			c=a+b;
			a=b;
			b=c;
		}
		System.out.println(a);

	}

}
