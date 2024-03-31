package number_pattern;

public class Vertical12345678 {

	public static void main(String[] args) {
		int n=3;
		for (int i = 1; i <= n; i++) {
			int num=i;
			for (int j = 1; j <= n; j++) {
				System.out.print(num+" ");
				num=num+n;
			}
			System.out.println();
		}

	}

}
