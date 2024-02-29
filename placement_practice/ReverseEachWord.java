package placement_practice;

public class ReverseEachWord {

	public static void main(String[] args) {
		String str="qspider oldairportroad";
		String []words=str.split(" ");
		String rev="";
		
		for(int i=0;i<words.length;i++) {
			String word=words[i];
			String revword="";
			
			for(int j=word.length()-1;j>=0;j--) {
				revword=revword+word.charAt(j);
			}
			rev=rev+revword+" ";
		}
		System.out.println(rev);
		

	}

}
