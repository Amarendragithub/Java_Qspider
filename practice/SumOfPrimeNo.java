package practice;

public class SumOfPrimeNo {

	public static void main(String[] args) {
		int n1=1,n2=5,sum=0;
		for(int i=n1;i<=n2;i++) {
			int count=0;
			for(int j=1;j<=i;j++) {
				if(i%j==0) {
					count++;
				}
			}
			if(count==2) {
				sum=sum+i;
				
			}
		}
		System.out.println(sum);

	}

}
