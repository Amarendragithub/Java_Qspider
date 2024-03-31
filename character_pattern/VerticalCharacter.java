package character_pattern;

public class VerticalCharacter {

	public static void main(String[] args) {
		int n=3;
		char ch='A';
		for(int i=1;i<=n;i++) {
			char ch1=ch;
			int num=ch;
			for(int j=1;j<=n;j++) {
				System.out.print(ch1+" ");
				num=num+n;
				ch1=(char)num;
			}
			System.out.println();
			ch++;
		}
	}

}
