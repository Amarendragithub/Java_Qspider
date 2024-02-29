package placement_practice;

public class DuplicateFoundString {

	public static void main(String[] args) {
		String str="amarendra";
		//int length=str.length();
		char[]ch=str.toCharArray();
		for(int i=0;i<str.length();i++) {
			for(int j=i+1;j<str.length();j++) {
				if(ch[i]==ch[j]) {
					System.out.println("Duplicate String are: " +ch[i]);
					break;
				}
			}
		}

	}

}
