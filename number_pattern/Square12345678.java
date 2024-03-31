package number_pattern;

public class Square12345678 {

	public static void main(String[] args) {
		int n=4,num=1;
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=n;j++) {
				if(num<=9)
				{
					System.out.print(num+"  ");
					num++;
				}
				else {
				System.out.print(num+" ");
				num++;
				}
//				System.out.print(num);
//				num++;
				
			}
			System.out.println();
		}

	}

}
