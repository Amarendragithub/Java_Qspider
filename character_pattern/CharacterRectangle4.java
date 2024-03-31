package character_pattern;

public class CharacterRectangle4 {

	public static void main(String[] args) {
		int n=4;
		char ch='A';
		for(int i=1;i<=n;i++) {
			
			for(int j=1;j<=n;j++) {
				if(i%2==0) {
					System.out.print(j+" ");
				}
				else {
					System.out.print(ch+" ");
					
				}
				
			}
			if(i%2==0) {
				ch++;
			}
			System.out.println();
		}


	}

}
