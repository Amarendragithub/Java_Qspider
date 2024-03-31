package number_pattern;

public class PyramidUsingNumbersIncrease {

	public static void main(String[] args) {
		int n=3;
		for(int i=1;i<=n;i++) {
			int num=1;
			for(int j=1;j<=n*2-1;j++) {
				if(i+j>=n+1&&j-i<=n-1) {
					System.out.print(num+" ");
					num++;
				}
				else {
					System.out.print("  ");
				}
			}
			System.out.println();
		}


	}

}
