package character_pattern;

public class Pyramid4 {

	public static void main(String[] args) {
		int n=3;
		for(int i=1;i<=n;i++) {
			char ch='A';
			for(int j=1;j<=n*2-1;j++) {
				if(i+j>=n+1&&j-i<=n-1) {
					System.out.print(ch+" ");
					if(j<n) {
						ch++;
					}
					else {
						ch--;
					}
				}
				else {
					System.out.print("  ");
				}
			}
			System.out.println();
		}

	}

}