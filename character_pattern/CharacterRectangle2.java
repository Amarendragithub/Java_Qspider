package character_pattern;

public class CharacterRectangle2 {

	public static void main(String[] args) {
		int n=4;
		for(int i=1;i<=n;i++) {
			char ch='A';
			for(int j=1;j<=n;j++) {
				System.out.print(ch+++" ");
			}
			System.out.println();
		}

	}

}
