package number_pattern;

public class M1 {

	public static void main(String[] args) {
		int n=4;
		int num=1;
		for(int i=1;i<=n;i++) {
			
			for(int j=1;j<=n;j++) {
				if(i+j>=n+1) {
				System.out.print(num+" ");
				num++;
				}else {
					System.out.print("  ");
				}
			}
			System.out.println();
		}
	}

}
