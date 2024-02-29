package programming;

public class NeonNumber16 {

	public static void main(String[] args) {
		int n=9,sum=0;
		int sq=n*n;
		while(sq>0)
		{
			int d=sq%10;
			sum=sum+d;
			sq=sq/10;
		}
		if(n==sum)
		{
			System.out.println(n+" is the neon number");
		}else {
			System.out.println(n+" is not neon number");
		}

	}

}
