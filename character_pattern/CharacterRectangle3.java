package character_pattern;

public class CharacterRectangle3 {

	public static void main(String[] args) {
		int n=4;
		char ch='A';
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=n;j++) {
				System.out.print(ch+" ");
			}
			ch++;
			System.out.println();
		}

	}

}
