package number_pattern;

public class Pattern3 {

	public static void main(String[] args) {
		int n=4;
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=n;j++) {
				if(i>=j) {
					System.out.print(j+" ");
				}else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}

	}

}
