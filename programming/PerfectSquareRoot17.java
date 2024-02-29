package programming;

public class PerfectSquareRoot17 {

	public static void main(String[] args) {
		int num=9;
		boolean flag=false;
		for(int i=1;i<=num;i++)
		{
			if(i*i==num)
			{
				flag=true;
				System.out.println(i);
				break;
			}
		}
		if(flag==false)
		{
			System.out.println("is not perfect root");
		}

	}

}
