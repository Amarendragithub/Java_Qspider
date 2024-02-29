package programming;

public class GivenNumberSunnyOrNot18 {

	public static void main(String[] args) {
		int n=8;
		int n1=n+1;
		boolean flag=false;
		for(int i=1;i<n1;i++)
		{
			if(i*i==n1) {
			flag=true;
			System.out.println(n+"is the sunny number");
			break;
			}
		}
		if(flag==false)
		{
			System.out.println(n+"is not sunny number");
		}

	}

}
