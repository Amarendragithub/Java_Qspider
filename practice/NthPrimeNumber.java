package practice;

public class NthPrimeNumber {

	public static void main(String[] args) {
		int target=3,count1=0;
		for(int i=1;count1<target;i++) {
			int count=0;
			for(int j=1;j<=i;j++) {
				if(i%j==0) {
					count++;
				}
			}
			if(count==2) {
				count1++;
			}
			if(count1==target) {
				System.out.println(i);
			}
		}
		

	}

}
