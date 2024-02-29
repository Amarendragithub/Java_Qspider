package programming;

public class FibonanciSeries {

	public static void main(String[] args) {
		int n=5,a=0,b=1,c=0;
		for(int i=1;i<=n;i++)
		{
			
			c=a+b;
			a=b;
			b=c;
		}
		System.out.println(a);

	}

}
