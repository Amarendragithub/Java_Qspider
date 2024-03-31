package number_pattern;

public class Solid1010 {

	public static void main(String[] args) {
		int n=4;
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=n;j++) {
				if(j%2==0) {
					System.out.print("0 ");
				}else {
					System.out.print("1 ");
				}
			}
			System.out.println();
		}

	}

}
